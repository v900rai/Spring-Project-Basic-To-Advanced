package com.student.demo.controller;

import com.student.demo.dto.StudentDTO;
import com.student.demo.model.Student;

import com.student.demo.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentService studentService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/students")
    public ResponseEntity<List<StudentDTO>> getStudents() {
        List<StudentDTO> st = studentService.getAllStudents();
        return new ResponseEntity<>(st, HttpStatus.OK);
    }

    @PostMapping("/student")
    public ResponseEntity<?> registerStudent(@Valid @RequestBody StudentDTO studentDto, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            Map<String, String> errors = new HashMap<>();
            errors = bindingResult.getFieldErrors().stream()
                    .collect(Collectors.toMap(
                      FieldError::getField,
                      FieldError::getDefaultMessage
                    ));
            return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
        }
        studentService.registerStudent(studentDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/student/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable long id) {
        studentService.deleteStudentById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/students")
    public ResponseEntity<?> deleteAllStudents(){
        studentService.deleteAllStudents();
        return  new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/student/{id}")
    public ResponseEntity<Void> updateStudent(@RequestBody Student student, @PathVariable long id) {
        studentService.updateStudent(id, student);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

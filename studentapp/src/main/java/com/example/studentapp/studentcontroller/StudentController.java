package com.example.studentapp.studentcontroller;

import com.example.studentapp.model.Student;
import com.example.studentapp.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {


    private StudentService studentService;

    public StudentController(StudentService service){
        this.studentService=service;
    }



    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/students")
    public List<Student> getAll() {
        return studentService.getAllStudents();
    }
}

package com.example.studentapp.service;

import com.example.studentapp.model.Student;
import com.example.studentapp.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    /**
     * constructor parametrise (constructor injections)
     */

    public StudentService(StudentRepository object){
        this.studentRepository=object;
    }

    public Student saveStudent(Student  student){
       return studentRepository.save(student);
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

}

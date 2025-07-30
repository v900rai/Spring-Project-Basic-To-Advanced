package com.student.demo.service;

import com.student.demo.dto.StudentDTO;
import com.student.demo.mapper.StudentMapper;
import com.student.demo.model.Student;
import com.student.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repository;

     @Autowired
     private StudentMapper studentMapper;
    @Override
    public List<StudentDTO> getAllStudents() {
         List<Student> students= repository.findAll();
       return   studentMapper.toDto(students);
    }
//    public List<Student> getAllStudents(){
//        return repository.findAll();
//    }

    @Override
    public void registerStudent(StudentDTO studentDto) {
        Student student = studentMapper.toEntity(studentDto);
        repository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        repository.deleteById(id);
    }
    @Override
    public void deleteAllStudents(){
        repository.deleteAll();
    }


    @Override
    public void updateStudent(Long id, Student updatedStudent) {
        Optional<Student> optionalStudent = repository.findById(id);
        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            if (updatedStudent.getName() != null) {
                student.setName(updatedStudent.getName());
            }
            if (updatedStudent.getSchool() != null) {
                student.setSchool(updatedStudent.getSchool());
            }
            if (updatedStudent.getMarks() != null) {
                student.setMarks(updatedStudent.getMarks());
            }
            repository.save(student);
        }
    }
}

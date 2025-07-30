// File: com/student/demo/service/StudentService.java

package com.student.demo.service;

import com.student.demo.dto.StudentDTO;
import com.student.demo.model.Student;
import java.util.List;

public interface StudentService {

    List<StudentDTO> getAllStudents();

    void registerStudent(StudentDTO studentDto);



    void updateStudent(Long id, Student student);
    void deleteStudentById(Long id);
    void deleteAllStudents();
}

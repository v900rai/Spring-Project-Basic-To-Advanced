package com.student.demo.mapper;

import com.student.demo.dto.StudentDTO;
import com.student.demo.model.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentMapper {

    public Student toEntity(StudentDTO studentDTO){
        Student student= new Student();
        student.setName(studentDTO.getName());
        student.setSchool(studentDTO.getSchool());
        student.setMarks(studentDTO.getMarks());
        student.setPassword(studentDTO.getPassword());
        return student;
    }

    public List<StudentDTO> toDto(List<Student> students){

        List<StudentDTO> studentDTOS = new ArrayList<>();
         for(int i=0; i<students.size(); i++){
             Student  st = students.get(i);
             StudentDTO studentDTO = new StudentDTO();
             studentDTO.setName(st.getName());
             studentDTO.setMarks(st.getMarks());
             studentDTO.setSchool(st.getSchool());
             studentDTOS.add(studentDTO);


         }
         return studentDTOS;

    }
}

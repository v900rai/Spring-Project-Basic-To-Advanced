package com.student.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


public class StudentDTO {

    private long id;

    @NotBlank(message = "name is a mandatory field! ")
    private String name;

    @JsonIgnore
    @Size(min = 6,  max = 10, message = "Password length must be between 6 & 10" )
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @NotBlank(message = "School name can't be empty ")
    private String school;

    @Min(value = 33, message = " Students must have more than 33 marks  to register ")
    @Max(value = 100, message = " marks can't be more than 100 ")
    private Long marks;

    public Long getMarks() {
        return marks;
    }

    public void setMarks(Long marks) {
        this.marks = marks;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public StudentDTO(long id, Long marks, String school, String name ,String password)  {
        this.id = id;
        this.marks = marks;
        this.school = school;
        this.name = name;
        this.password = password;
    }

    public StudentDTO(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", school='" + school + '\'' +
                ", marks=" + marks +
                ", password=" + password +
                '}';
    }
}



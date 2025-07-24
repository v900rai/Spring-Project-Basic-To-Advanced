package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
//यह Controller "/api" URL के तहत APIs को handle करता है
//This controller handles APIs under the "/api" URL path
@RestController
@RequestMapping("/api")
public class Controller {

    // Repository को Autowire किया गया है ताकि database operations किये जा सकें
    // Injecting the repository to perform database operations
    @Autowired
    EmployeeRepository repository;

    // ✅ सभी employees को लाने के लिए GET API
    // GET API to fetch all employees
    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> allEmployees = repository.findAll(); // DB से सभी employees को लाएं
        return new ResponseEntity<>(allEmployees, HttpStatus.OK); // 200 OK
    }

    // ✅ एक नया employee create करने के लिए POST API
    // POST API to create a new employee
    @PostMapping("/employees")
    public ResponseEntity<String> createEmployee(@RequestBody Employee employee) {
        repository.save(employee); // Employee DB में सेव करें
        return new ResponseEntity<>("Employee created in database", HttpStatus.CREATED); // 201 Created
    }

    // ✅ एक employee को ID से लाने के लिए GET API
    // GET API to fetch a specific employee by ID
    @GetMapping("/employees/{id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable Long id) {
        Optional<Employee> employee = repository.findById(id); // ID से employee खोजें

        if (employee.isPresent()) {
            return new ResponseEntity<>(employee.get(), HttpStatus.OK); // 200 OK
        } else {
            return new ResponseEntity<>("Employee not found", HttpStatus.NOT_FOUND); // 404 Not Found
        }
    }

    // ✅ एक employee को update करने के लिए PUT API
    // PUT API to update employee by ID
    @PutMapping("/employees/{id}")
    public ResponseEntity<String> updateEmployee(@PathVariable Long id, @RequestBody Employee updatedEmployee) {
        Optional<Employee> employee = repository.findById(id);

        if (employee.isPresent()) {
            Employee existing = employee.get();
            existing.setName(updatedEmployee.getName());
            //existing.setEmail(updatedEmployee.getEmail());
            //existing.setDepartment(updatedEmployee.getDepartment());
            repository.save(existing); // अपडेटेड डाटा सेव करें
            return new ResponseEntity<>("Employee updated successfully", HttpStatus.OK); // 200 OK
        } else {
            return new ResponseEntity<>("Employee not found", HttpStatus.NOT_FOUND); // 404
        }
    }

    // ✅ एक employee को delete करने के लिए DELETE API
    // DELETE API to delete employee by ID
    @DeleteMapping("/employees/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id); // DB से employee को हटाएं
            return new ResponseEntity<>("Employee deleted successfully", HttpStatus.OK); // 200 OK
        } else {
            return new ResponseEntity<>("Employee not found", HttpStatus.NOT_FOUND); // 404 Not Found
        }
    }
}

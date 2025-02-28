package com.texas.miniproject.controllers;

import com.texas.miniproject.entity.Student;
import com.texas.miniproject.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.hibernate.sql.ast.tree.expression.Over;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/test")
    public String test(){
        return "Hello";
    }

    @PostMapping
    public ResponseEntity<Student> save(@RequestBody Student student){
        Student createdStudent = studentService.createdStudent(student);
        return new ResponseEntity<>(createdStudent, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Student>> list(){
        return new ResponseEntity<>(studentService.getAll(),HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Student>>getById(@PathVariable Long id){
        return new ResponseEntity<>(studentService.getById(id),HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void>deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
    @PutMapping
    public ResponseEntity<Student>update(@RequestBody Student student){
        return new ResponseEntity<>(studentService.updateStudent(student),HttpStatus.OK);
    }
    }

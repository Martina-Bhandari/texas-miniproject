package com.texas.miniproject.controllers;

import com.texas.miniproject.entity.Department;
import com.texas.miniproject.services.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("department")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }


    @PostMapping
    public ResponseEntity<Department> save(@RequestBody Department department) {
        return new ResponseEntity<Department>(departmentService.saveDepartment(department), HttpStatus.OK);
    }
    @GetMapping
    public List<Department> ListDepartment() {
        return departmentService.listAllDepartment();
    }

    @GetMapping("/{id}")
    public Optional<Department> getById(@PathVariable long id) {
        return departmentService.getDepartmentById(id);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDepartment(@PathVariable Long id) {
        departmentService.deleteDepartment(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PutMapping
    public ResponseEntity<Department> update(@RequestBody Department department) {
        return new ResponseEntity<>(departmentService.updateDepartment(department), HttpStatus.OK);
    }
}
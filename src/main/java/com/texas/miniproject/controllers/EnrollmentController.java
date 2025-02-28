package com.texas.miniproject.controllers;

import com.texas.miniproject.entity.Enrollment;
import com.texas.miniproject.services.EnrollmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("enrollment")
public class EnrollmentController {

    private final EnrollmentService enrollmentService;

    public EnrollmentController(EnrollmentService enrollmentService) {
        this.enrollmentService = enrollmentService;
    }

    @PostMapping
    public ResponseEntity<Enrollment> save(@RequestBody Enrollment enrollment){
        return new ResponseEntity<>(enrollmentService.saveEnrollment(enrollment), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Enrollment> list(){
        return enrollmentService.listAllEnrollment();
    }

    @GetMapping("/{id}")
    public Optional<Enrollment> getById(@PathVariable Long id){
        return enrollmentService.getEnrollmentBy(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEnrollment(@PathVariable Long id){
        enrollmentService.deleteEnrollment(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping
    public ResponseEntity<Enrollment> update(@RequestBody Enrollment enrollment){
        return new ResponseEntity<>(enrollmentService.updateEnrollment(enrollment), HttpStatus.OK);
    }

}
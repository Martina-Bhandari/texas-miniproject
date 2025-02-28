package com.texas.miniproject.controllers;

import com.texas.miniproject.entity.Instructor;
import com.texas.miniproject.services.InstructorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("instructor")
public class InstructorController {

    private final InstructorService instructorService;

    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    @PostMapping
    public ResponseEntity<Instructor> save(@RequestBody Instructor instructor){
        return new ResponseEntity<>(instructorService.saveInstructor(instructor), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Instructor> list(){
        return instructorService.listAllInstructor();
    }

    @GetMapping("/{id}")
    public Optional<Instructor> getById(@PathVariable Long id){
        return instructorService.getInstructorBy(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInstructor(@PathVariable Long id){
        instructorService.deleteInstructor(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping
    public ResponseEntity<Instructor> update(@RequestBody Instructor instructor){
        return new ResponseEntity<>(instructorService.updateInstructor(instructor), HttpStatus.OK);
    }


}
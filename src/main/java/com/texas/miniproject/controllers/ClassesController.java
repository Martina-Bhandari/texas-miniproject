package com.texas.miniproject.controllers;

import com.texas.miniproject.entity.Classes;
import com.texas.miniproject.services.ClassesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("classes")
public class ClassesController {

    private final ClassesService classesService;

    public ClassesController(ClassesService classesService) {
        this.classesService = classesService;
    }

    @PostMapping
    public ResponseEntity<Classes> save(@RequestBody Classes classes){
        return new ResponseEntity<>(classesService.saveClasses(classes), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Classes> list(){
        return classesService.listAllClasses();
    }

    @GetMapping("/{id}")
    public Optional<Classes> getById(@PathVariable Long id){
        return classesService.getClassesBy(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClasses(@PathVariable Long id){
        classesService.deleteClasses(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping
    public ResponseEntity<Classes> update(@RequestBody Classes classes){
        return new ResponseEntity<>(classesService.updateClasses(classes), HttpStatus.OK);
    }
}
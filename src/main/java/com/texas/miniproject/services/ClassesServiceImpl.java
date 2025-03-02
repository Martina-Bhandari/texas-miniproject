package com.texas.miniproject.services;

import com.texas.miniproject.entity.Classes;
import com.texas.miniproject.repository.ClassesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassesServiceImpl implements ClassesService {

    private final ClassesRepository classesRepository;

    public ClassesServiceImpl(ClassesRepository classesRepository) {
        this.classesRepository = classesRepository;
    }

    @Override
    public Classes saveClasses(Classes classes) {
        return classesRepository.save(classes);
    }

    @Override
    public List<Classes> listAllClasses() {
        return classesRepository.findAll();
    }

    @Override
    public Optional<Classes> getClassesBy(Long id) {
        return classesRepository.findById(id);
    }

    @Override
    public void deleteClasses(Long id) {
        classesRepository.deleteById(id);
    }

    @Override
    public Classes updateClasses(Classes classes) {
        return classesRepository.saveAndFlush(classes);
    }
}
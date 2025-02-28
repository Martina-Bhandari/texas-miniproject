package com.texas.miniproject.services;

import com.texas.miniproject.entity.Instructor;
import com.texas.miniproject.repository.InstructorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstructorServiceImpl implements InstructorService {

    private final InstructorRepository instructorRepository;

    public InstructorServiceImpl(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    @Override
    public Instructor saveInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public List<Instructor> listAllInstructor() {
        return instructorRepository.findAll();
    }

    @Override
    public Optional<Instructor> getInstructorBy(Long id) {
        return instructorRepository.findById(id);
    }

    @Override
    public void deleteInstructor(Long id) {
        instructorRepository.deleteById(id);
    }

    @Override
    public Instructor updateInstructor(Instructor instructor) {
        return instructorRepository.saveAndFlush(instructor);
    }

}
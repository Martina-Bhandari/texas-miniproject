package com.texas.miniproject.services;

import com.texas.miniproject.entity.Enrollment;
import com.texas.miniproject.repository.EnrollmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnrollmentServiceImpl implements EnrollmentService{

    private final EnrollmentRepository enrollmentRepository;

    public EnrollmentServiceImpl(EnrollmentRepository enrollmentRepository) {
        this.enrollmentRepository = enrollmentRepository;
    }

    @Override
    public Enrollment saveEnrollment(Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }

    @Override
    public List<Enrollment> listAllEnrollment() {
        return enrollmentRepository.findAll();
    }

    @Override
    public Optional<Enrollment> getEnrollmentBy(Long id) {
        return enrollmentRepository.findById(id);
    }

    @Override
    public void deleteEnrollment(Long id) {
        enrollmentRepository.deleteById(id);
    }

    @Override
    public Enrollment updateEnrollment(Enrollment enrollment) {
        return enrollmentRepository.saveAndFlush(enrollment);
    }

}
package com.texas.miniproject.services;
import java.util.List;
import java.util.Optional;

import com.texas.miniproject.entity.Student;

public interface StudentService {
    Student createdStudent(Student student);

    List<Student> getAll();

    Optional<Student> getById(Long id);

    void deleteStudent(Long id);

    Student updateStudent(Student student);

}

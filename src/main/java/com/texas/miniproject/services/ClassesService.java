package com.texas.miniproject.services;

import com.texas.miniproject.entity.Classes;

import java.util.List;
import java.util.Optional;

public interface ClassesService {

    Classes saveClasses(Classes classes);

    List<Classes> listAllClasses();

    Optional<Classes> getClassesBy(Long id);

    void deleteClasses(Long id);

    Classes updateClasses(Classes classes);
}
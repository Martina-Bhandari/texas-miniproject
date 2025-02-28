package com.texas.miniproject.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "enrollment")
public class Enrollment {
    @Id
    @SequenceGenerator(name = "enrollment_sequence", sequenceName = "enrollment_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "enrollment_sequence")
    private Long id;
    private Long studentId;
    private Long courseId;
    private LocalDate enrollmentDate;
    private String grade;
}
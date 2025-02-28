package com.texas.miniproject.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "instructor")
public class Instructor {
    @Id
    @SequenceGenerator(name = "instructor_sequence", sequenceName = "instructor_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "instructor_sequence")
    private Long id;
    private String name;
    private String email;
    private String phone;
    private Long departmentId;
}
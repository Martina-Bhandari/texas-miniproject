package com.texas.miniproject.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
public class Student {
    @Id
    @SequenceGenerator(name="student_sequence",sequenceName = "student_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="student_sequence")
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;
    private String grade;
}
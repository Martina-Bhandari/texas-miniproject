package com.texas.miniproject.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "classes")
public class Classes {
    @Id
    @SequenceGenerator(name = "classes_sequence", sequenceName = "classes_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "classes_sequence")
    private Long id;
    private String semester;
    private Integer years;
    private String schedule;

    @ManyToOne
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    private Course course;

    @ManyToOne
    @JoinColumn(name = "instructor_id", referencedColumnName = "id")
    private Instructor instructor;

}
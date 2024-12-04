package com.mentoria.domain.entitie;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "class_semester")
public class ClassSemester {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classSemesterId;

    @ManyToOne
    @JoinColumn(name = "student_student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @ManyToOne
    @JoinColumn(name = "semeter_id")
    private Semester semester;

    private String status;

}

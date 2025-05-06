package com.mentoria.domain.entitie;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    private String studentName;

    private String studentRa;

    private String studentEmail;

    private String studentPassword;

    @ManyToMany
    @JoinTable(
            name = "student_courses",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<Course> studentCourses;

    @ManyToMany
    @JoinTable(
            name = "student_roles",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> studentRoles;


    @OneToMany(mappedBy = "student")
    private List<Posts> studentPosts;

    @OneToMany(mappedBy = "mentor")
    private List<Posts> mentorResolution;

}

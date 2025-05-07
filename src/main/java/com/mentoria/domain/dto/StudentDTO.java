package com.mentoria.domain.dto;

import com.mentoria.domain.entitie.Course;
import com.mentoria.domain.entitie.Posts;
import com.mentoria.domain.entitie.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentDTO {

    private String studentName;
    private String studentRa;
    private String studentEmail;
    private String studentPassword;
    private List<Course> studentCourses;
    private List<Role> studentRoles;
    private List<Posts> studentPosts;
    private List<Posts> mentorResolution;
}

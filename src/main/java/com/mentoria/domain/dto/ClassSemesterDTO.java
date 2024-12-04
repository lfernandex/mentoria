package com.mentoria.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClassSemesterDTO {

    private StudentDTO student;
    private CourseDTO course;
    private SemesterDTO semester;
    private String status;
}

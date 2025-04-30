package com.mentoria.domain.dto;

import com.mentoria.domain.enuns.SemesterEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClassSemesterDTO {

    private CourseDTO course;
    private SemesterDTO semester;
    private SemesterEnum status;
}

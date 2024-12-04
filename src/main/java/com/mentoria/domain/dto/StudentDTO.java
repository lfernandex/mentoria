package com.mentoria.domain.dto;

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

    private String name;
    private String ra;
    private String email;
    private String password;
    private List<ClassSemesterDTO> classSemester;
}

package com.mentoria.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mentoria.domain.entitie.Course;
import com.mentoria.domain.entitie.Posts;
import com.mentoria.domain.entitie.Role;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = false)
public class StudentDTO {

    @NotBlank(message = "Nome obrigatório")
    private String studentName;
    @NotBlank(message = "RA obrigátorio")
    private String studentRa;
    @NotBlank(message = "Email obgrigatório")
    private String studentEmail;
    @NotBlank(message = "Senha é obrigátorio")
    private String studentPassword;
}

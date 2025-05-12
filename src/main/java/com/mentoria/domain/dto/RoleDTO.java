package com.mentoria.domain.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mentoria.domain.enuns.RoleEnum;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = false)
public class RoleDTO {

    @Enumerated(EnumType.STRING)
    private RoleEnum roleName;
}

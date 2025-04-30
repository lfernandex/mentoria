package com.mentoria.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SemesterDTO {

    private String name;
    private Date dateInit;
    private Date dateEnd;
}

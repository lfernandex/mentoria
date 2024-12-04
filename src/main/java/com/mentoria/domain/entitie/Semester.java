package com.mentoria.domain.entitie;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "semeter")
public class Semester {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long semesterId;

    private String name;

    private Date dateInit;

    private Date dateEnd;

    @OneToMany(mappedBy = "semester")
    private List<ClassSemester> semesters;
}

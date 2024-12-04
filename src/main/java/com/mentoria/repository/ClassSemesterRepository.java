package com.mentoria.repository;

import com.mentoria.domain.entitie.ClassSemester;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassSemesterRepository extends JpaRepository<ClassSemester, Long> {
}

package com.mentoria.repository;

import com.mentoria.domain.entitie.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}

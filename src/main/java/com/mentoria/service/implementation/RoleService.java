package com.mentoria.service.implementation;

import com.mentoria.domain.entitie.Role;
import com.mentoria.domain.enuns.ErrorEnum;
import com.mentoria.exception.BusinessException;
import com.mentoria.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public void saveRoles(List<Role> role) {
        try {
            roleRepository.saveAll(role);
        }catch (RuntimeException e){
            throw new BusinessException(ErrorEnum.INVALID_ROLE);
        }
    }
}

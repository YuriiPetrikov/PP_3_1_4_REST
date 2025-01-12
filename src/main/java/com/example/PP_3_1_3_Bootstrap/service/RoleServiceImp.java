package com.example.PP_3_1_3_Bootstrap.service;

import com.example.PP_3_1_3_Bootstrap.dao.RoleDaoImp;
import com.example.PP_3_1_3_Bootstrap.model.Role;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class RoleServiceImp implements RoleService {
    private final RoleDaoImp roleRepository;

    public RoleServiceImp(RoleDaoImp roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void addRole(Role role) {
        roleRepository.save(role);
    }
}

package com.example.PP_3_1_3_Bootstrap.dao;

import com.example.PP_3_1_3_Bootstrap.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDaoImp extends JpaRepository<Role, Long> {
}

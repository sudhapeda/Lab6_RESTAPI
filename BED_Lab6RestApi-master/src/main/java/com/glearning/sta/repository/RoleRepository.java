package com.glearning.sta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.glearning.sta.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}

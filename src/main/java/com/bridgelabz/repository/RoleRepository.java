package com.bridgelabz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.model.Role;

@Repository("RoleRepository")
public interface RoleRepository extends JpaRepository<Role, Integer> {

	public Role findByRole(String role);
}

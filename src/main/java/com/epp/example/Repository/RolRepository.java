package com.epp.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epp.example.Entity.Rol;

public interface RolRepository extends JpaRepository<Rol, Long> {

	
}

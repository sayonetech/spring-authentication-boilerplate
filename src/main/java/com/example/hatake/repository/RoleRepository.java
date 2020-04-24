package com.example.hatake.repository;

import java.util.Optional;

import com.example.hatake.models.ERole;
import com.example.hatake.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}

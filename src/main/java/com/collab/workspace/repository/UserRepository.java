package com.collab.workspace.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.collab.workspace.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

    Optional<User> findByEmail(String email);

}
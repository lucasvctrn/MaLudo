package com.lucasvictorion.maludoback.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lucasvictorion.maludoback.models.ERole;
import com.lucasvictorion.maludoback.models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
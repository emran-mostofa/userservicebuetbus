package com.buetbusexp.userservicebuetbus.repository;

import com.buetbusexp.userservicebuetbus.models.ERole;
import com.buetbusexp.userservicebuetbus.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@EnableJpaRepositories
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}

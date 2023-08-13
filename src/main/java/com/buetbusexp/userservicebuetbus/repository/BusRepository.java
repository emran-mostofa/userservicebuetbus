package com.buetbusexp.userservicebuetbus.repository;

import com.buetbusexp.userservicebuetbus.models.BType;
import com.buetbusexp.userservicebuetbus.models.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@EnableJpaRepositories
public interface BusRepository extends JpaRepository<Bus, Long> {
  Optional<Bus> findByName(String name);
  Optional<Bus> findById(Long id);


//  Optional<Bus> findByBusType(BType busType);
  Boolean existsByName(String name);
//  Boolean existsByBusType(BType busType);
}
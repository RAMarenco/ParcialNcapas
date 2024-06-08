package org.happybaras.parcial2.repositories;

import org.happybaras.parcial2.domain.entities.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface SpecialtyRepository extends JpaRepository<Specialty, UUID> {
    Optional<Specialty> findByName(String name);
}

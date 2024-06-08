package org.happybaras.parcial2.services;

import org.happybaras.parcial2.domain.entities.Specialty;

import java.util.Optional;

public interface SpecialtiesService {
    Optional<Specialty> findByName(String name);
}

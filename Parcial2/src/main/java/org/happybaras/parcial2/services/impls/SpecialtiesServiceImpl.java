package org.happybaras.parcial2.services.impls;

import org.happybaras.parcial2.domain.entities.Specialty;
import org.happybaras.parcial2.repositories.SpecialtyRepository;
import org.happybaras.parcial2.services.SpecialtiesService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SpecialtiesServiceImpl implements SpecialtiesService {
    private final SpecialtyRepository specialtyRepository;

    public SpecialtiesServiceImpl(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Optional<Specialty> findByName(String name) {
        return specialtyRepository.findByName(name);
    }
}

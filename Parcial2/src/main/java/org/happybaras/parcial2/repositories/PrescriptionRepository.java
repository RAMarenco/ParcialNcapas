package org.happybaras.parcial2.repositories;

import org.happybaras.parcial2.domain.entities.Appointment;
import org.happybaras.parcial2.domain.entities.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface PrescriptionRepository extends JpaRepository<Prescription, UUID> {
    Optional<Prescription> findPrescriptionById(UUID id);

    // Get prescriptions by medicine
    Optional<Prescription> findPrescriptionsByMedicine(String medicine);

    // Get prescriptions by appointment
    List<Prescription> findPrescriptionsByAppointment(Appointment appointment);
}

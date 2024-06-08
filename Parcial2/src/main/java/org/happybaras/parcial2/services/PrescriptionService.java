package org.happybaras.parcial2.services;

import org.happybaras.parcial2.domain.entities.Appointment;
import org.happybaras.parcial2.domain.entities.Prescription;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PrescriptionService {
    Optional<Prescription> findPrescriptionById(UUID id);
    Optional<Prescription> findPrescriptionsByMedicine(String medicine);
    List<Prescription> findPrescriptionsByAppointment(Appointment appointment);
}

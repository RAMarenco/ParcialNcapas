package org.happybaras.parcial2.services.impls;

import org.happybaras.parcial2.domain.entities.Appointment;
import org.happybaras.parcial2.domain.entities.Prescription;
import org.happybaras.parcial2.repositories.PrescriptionRepository;
import org.happybaras.parcial2.services.PrescriptionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {
    private final PrescriptionRepository prescriptionRepository;

    public PrescriptionServiceImpl(PrescriptionRepository prescriptionRepository) {
        this.prescriptionRepository = prescriptionRepository;
    }

    @Override
    public Optional<Prescription> findPrescriptionById(UUID id) {
        return prescriptionRepository.findPrescriptionById(id);
    }

    @Override
    public Optional<Prescription> findPrescriptionsByMedicine(String medicine) {
        return prescriptionRepository.findPrescriptionsByMedicine(medicine);
    }

    @Override
    public List<Prescription> findPrescriptionsByAppointment(Appointment appointment) {
        return prescriptionRepository.findPrescriptionsByAppointment(appointment);
    }
}

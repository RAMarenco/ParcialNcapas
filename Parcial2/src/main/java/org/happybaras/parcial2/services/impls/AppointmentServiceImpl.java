package org.happybaras.parcial2.services.impls;

import org.happybaras.parcial2.domain.entities.Appointment;
import org.happybaras.parcial2.domain.entities.User;
import org.happybaras.parcial2.repositories.AppointmentRepository;
import org.happybaras.parcial2.services.AppointmentService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AppointmentServiceImpl implements AppointmentService {
    private final AppointmentRepository appointmentRepository;

    public AppointmentServiceImpl(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public Optional<Appointment> findAppointmentById(UUID id) {
        return appointmentRepository.findAppointmentById(id);
    }

    @Override
    public Optional<Appointment> findAppointmentByStatus(String status) {
        return appointmentRepository.findAppointmentByStatus(status);
    }

    @Override
    public List<Appointment> findAppointmentsByUserAndDateTimeLessThanEqualAndStatus(User user, LocalDateTime startTime, String status) {
        return appointmentRepository.findAppointmentsByUserAndDateTimeLessThanEqualAndStatus(user, startTime, status);
    }
}

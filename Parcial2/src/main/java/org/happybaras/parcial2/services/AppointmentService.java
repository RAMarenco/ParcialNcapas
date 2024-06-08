package org.happybaras.parcial2.services;

import org.happybaras.parcial2.domain.dtos.RequestAppointmentDTO;
import org.happybaras.parcial2.domain.entities.Appointment;
import org.happybaras.parcial2.domain.entities.User;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AppointmentService {
    void createAppointmentRequest(User user, LocalDateTime dateTime);
    Optional<Appointment> findAppointmentById(UUID id);
    Optional<Appointment> findAppointmentByStatus(String status);
    List<Appointment> findAppointmentsByUserAndDateTimeLessThanEqualAndStatus(User user, LocalDateTime startTime, String status);
}

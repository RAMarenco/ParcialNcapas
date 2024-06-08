package org.happybaras.parcial2.repositories;

import org.happybaras.parcial2.domain.entities.Appointment;
import org.happybaras.parcial2.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AppointmentRepository extends JpaRepository<Appointment, UUID> {
    Optional<Appointment> findAppointmentById(UUID id);

    // Obtain appointments by status
    Optional<Appointment> findAppointmentByStatus(String status);

    Optional<Appointment> findByUserAndDateTime(User user, LocalDateTime dateTime);

    // Obtain appointments by user given a start time
    List<Appointment> findAppointmentsByUserAndDateTimeLessThanEqualAndStatus(User user, LocalDateTime startTime, String status);
}

package org.happybaras.parcial2.controllers;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.happybaras.parcial2.domain.dtos.GeneralResponse;
import org.happybaras.parcial2.domain.dtos.RequestAppointmentDTO;
import org.happybaras.parcial2.domain.entities.Appointment;
import org.happybaras.parcial2.domain.entities.User;
import org.happybaras.parcial2.services.AppointmentService;
import org.happybaras.parcial2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
@RestController
@RequestMapping("/api/appointment")
public class AppointmentController {
    private final AppointmentService appointmentService;
    private final UserService userService;

    public AppointmentController(AppointmentService appointmentService, UserService userService) {
        this.appointmentService = appointmentService;
        this.userService = userService;
    }

    // The user will be able to create an appointment without a doctor nor a specialty
    @PostMapping("/public/request-appointment")
    @PreAuthorize("isAuthenticated()")
    public ResponseEntity<GeneralResponse> request(@RequestBody @Valid RequestAppointmentDTO info) {
        User user;
        log.info(info.getDateTime());
        LocalDateTime dateTime = LocalDateTime.parse(info.getDateTime(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

        try {
            user = userService.findUserAuthenticated();
        } catch (Exception e) {
            return GeneralResponse.builder().status(HttpStatus.NOT_FOUND).getResponse();
        }

        Appointment appointment = appointmentService.findByUserAndDateTime(user, dateTime);

        if(appointment != null)
            return GeneralResponse.builder().message("Appointment already exists").status(HttpStatus.CONFLICT).getResponse();
//
        appointmentService.createAppointmentRequest(user, dateTime);

        return GeneralResponse.builder().message("Appointment created succesfully").getResponse();
    }

    // The assistant will be able to create an appointment but should assign at least one doctor and one specialty
    @PostMapping("/create-appointment")
    @PreAuthorize("hasAuthority('ASTE')")
    public ResponseEntity<GeneralResponse> create(/* TODO: AppointmentDTO for creation */) {
        return GeneralResponse.builder().getResponse();
    }

    // Update a single appointment by the assistant to approve it. It should require the doctors and specialties that will be necessary for this appointment
    @PostMapping("/approve")
    @PreAuthorize("hasAuthority('ASTE')")
    public ResponseEntity<GeneralResponse> approve(/* TODO: AppointmentDTO for approving */) {
        return GeneralResponse.builder().getResponse();
    }

    // Update a single appointment by the assistant to reject it
    @PostMapping("/reject")
    @PreAuthorize("hasAuthority('ASTE')")
    public ResponseEntity<GeneralResponse> reject(/* TODO: AppointmentDTO for rejecting */) {
        return GeneralResponse.builder().getResponse();
    }

    // Find all appointments
    @GetMapping("/find-all")
    @PreAuthorize("hasAuthority('ASTE')")
    public ResponseEntity<GeneralResponse> findAll() {
        return GeneralResponse.builder().getResponse();
    }

    // Find all appointments of the current day
    @GetMapping("/find-by-period")
    @PreAuthorize("hasAuthority('ASTE')")
    public ResponseEntity<GeneralResponse> findByPeriod() {
        return GeneralResponse.builder().getResponse();
    }

    // Find all appointments booked of a doctor
    @GetMapping("/find-by-doctor")
    @PreAuthorize("hasAuthority('ASTE')")
    public ResponseEntity<GeneralResponse> findByDoctor(/* TODO: Make a DTO where the doctor identifier is required */) {
        return GeneralResponse.builder().getResponse();
    }

    // Find all appointments that are pending to be approved
    @GetMapping("/find-pending")
    @PreAuthorize("hasAuthority('ASTE')")
    public ResponseEntity<GeneralResponse> findRequestedAppointments() {
        /* TODO: Make a service to request all appointments that have not been accepted yet*/
        return GeneralResponse.builder().getResponse();
    }

}

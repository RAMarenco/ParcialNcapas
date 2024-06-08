package org.happybaras.parcial2.controllers;

import org.happybaras.parcial2.domain.dtos.GeneralResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/appointment")
public class AppointmentController {
    /* TODO: Inject dependency of AppointmentService */

    // The user will be able to create an appointment without a doctor nor a specialty
    @PostMapping("/public/request-appointment")
    @PreAuthorize("isAuthenticated()")
    public ResponseEntity<GeneralResponse> request(/* TODO: AppointmentDTO for request creation */) {
        return GeneralResponse.builder().getResponse();
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

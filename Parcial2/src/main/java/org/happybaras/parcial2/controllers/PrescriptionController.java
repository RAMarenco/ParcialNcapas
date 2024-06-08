package org.happybaras.parcial2.controllers;

import org.happybaras.parcial2.domain.dtos.GeneralResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prescription")
public class PrescriptionController {
    /* TODO: Inject dependency of precription service */

    @PostMapping("/add-prescription-to-appointment")
    public ResponseEntity<GeneralResponse> addPrescription(/* TODO: Prescription and Appoointment DTO*/) {
        return GeneralResponse.builder().getResponse();
    }

    @GetMapping("/find-all")
    public ResponseEntity<GeneralResponse> findAll() {
        return GeneralResponse.builder().getResponse();
    }

}
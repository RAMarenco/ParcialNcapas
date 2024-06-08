package org.happybaras.parcial2.controllers;

import org.happybaras.parcial2.domain.dtos.GeneralResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @GetMapping("/find-all")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<GeneralResponse> findAll() {
        return GeneralResponse.builder().getResponse();
    }

    @DeleteMapping("/delete")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<GeneralResponse> delete(/* TODO: UserDeleteDTO*/) {
        return GeneralResponse.builder().getResponse();
    }

    @PostMapping("/update")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<GeneralResponse> update(/* TODO: UserUpdateDTO */) {
        return GeneralResponse.builder().getResponse();
    }
}
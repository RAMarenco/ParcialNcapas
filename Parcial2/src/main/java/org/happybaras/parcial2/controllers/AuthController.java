package org.happybaras.parcial2.controllers;

import org.happybaras.parcial2.domain.dtos.GeneralResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth/")
public class AuthController {
    /* TODO: Inject dependency of UserService */

    @PostMapping("/login")
    public ResponseEntity<GeneralResponse> login(/* TODO: LoginDTO*/) {
        return GeneralResponse.builder().getResponse();
    }

    @PostMapping("/register")
    public ResponseEntity<GeneralResponse> register(/* TODO: RegisterDTO*/) {
        return GeneralResponse.builder().getResponse();
    }
}

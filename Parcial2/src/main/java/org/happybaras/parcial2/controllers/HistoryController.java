package org.happybaras.parcial2.controllers;

import org.happybaras.parcial2.domain.dtos.GeneralResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/history")
public class HistoryController {
    /* TODO: Inject dependency of HistoryService */

    @GetMapping("/find-by-user")
    public ResponseEntity<GeneralResponse> findByUser(/* TODO: make a UserHistoryDTO */) {
        return GeneralResponse.builder().getResponse();
    }

    @PostMapping("/create-new-register")
    public ResponseEntity<GeneralResponse> createNewRegister (/* TODO: HistoryDTO */) {
        return GeneralResponse.builder().getResponse();
    }
}

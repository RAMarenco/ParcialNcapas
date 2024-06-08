package org.happybaras.parcial2.domain.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginDTO {
    @NotBlank
    private String identifier;
    @NotBlank
    private String password;
}

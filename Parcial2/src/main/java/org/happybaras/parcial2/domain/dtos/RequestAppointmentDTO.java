package org.happybaras.parcial2.domain.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestAppointmentDTO {
    @NotBlank
    @Pattern(regexp = "yyyy/MM/dd HH:mm:ss")
    private LocalDateTime dateTime;
}

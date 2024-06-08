package org.happybaras.parcial2.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "happy_appointments")
public class Appointment {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

        @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    @Column(name = "date_time")
    private LocalDateTime dateTime;

    @OneToMany(mappedBy = "appointment", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<UserAppointment> userAppointment;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;

    @OneToMany(mappedBy = "appointment", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Prescription> prescription;

    @Column(name = "status")
    @ColumnDefault(value = "'pending'")
    private String status;
}

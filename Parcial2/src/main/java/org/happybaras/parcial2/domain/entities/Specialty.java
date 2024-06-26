package org.happybaras.parcial2.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "happy_specialties")
public class Specialty {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;
}

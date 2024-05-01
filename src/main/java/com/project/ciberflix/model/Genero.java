package com.project.ciberflix.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "genero")
public class Genero {
    @Id
    @GeneratedValue
    @Column(name = "genero_id")
    private int id;

    @Column(name = "genero_nombre")
    private String nombre;
}

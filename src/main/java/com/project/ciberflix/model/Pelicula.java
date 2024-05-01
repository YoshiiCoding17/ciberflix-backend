package com.project.ciberflix.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "pelicula")
public class Pelicula {
    @Id
    @GeneratedValue
    @Column(name = "pelicula_id")
    private int id;

    @Column(name = "pelicula_nombre")
    private String nombre;
    @Column(name = "pelicula_imagen")
    private String imagen;

    @ManyToMany
    @JoinTable(
            name = "pelicula_genero",
            joinColumns = @JoinColumn(name = "pelicula_id"),
            inverseJoinColumns = @JoinColumn(name = "genero_id")
    )
    private List<Genero> generos;

    @Column(name = "pelicula_anio")
    private int anio;

    @Column(name = "pelicula_votos")
    private int votos;

}

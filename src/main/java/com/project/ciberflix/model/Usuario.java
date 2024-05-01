package com.project.ciberflix.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue
    @Column(name = "usuario_id")
    private int id;

    @Column(name = "usuario_nombre")
    private String nombre;

    @Column(name = "usuario_rol")
    private int rol;

    @Column(name = "usuario_correo")
    private String correo;

    @Column(name = "usuario_password")
    private String password;

    @ManyToMany
    @JoinTable(
            name = "usuario_peliculas",
            joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "pelicula_id")
    )
    private List<Pelicula> peliculas;
}

package com.project.ciberflix.service;

import com.project.ciberflix.model.Pelicula;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IPeliculaService {
    public List<Pelicula> listarPeliculas();
    public Pelicula obtenerPelicula(Integer id);
    public Pelicula modificarPelicula(Pelicula p);
    public Pelicula registrarPelicula(Pelicula p);
    public String eliminarPelicula(Integer id);
}

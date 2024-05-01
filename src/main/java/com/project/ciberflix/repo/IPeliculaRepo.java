package com.project.ciberflix.repo;

import com.project.ciberflix.model.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPeliculaRepo extends JpaRepository<Pelicula,Integer> {
}

package com.project.ciberflix.repo;

import com.project.ciberflix.model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGeneroRepo extends JpaRepository<Genero,Integer> {
}

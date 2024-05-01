package com.project.ciberflix.repo;


import com.project.ciberflix.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepo extends JpaRepository<Usuario,Integer> {
}

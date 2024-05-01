package com.project.ciberflix.service.impl;
import com.project.ciberflix.model.Pelicula;
import com.project.ciberflix.model.Usuario;
import com.project.ciberflix.repo.IPeliculaRepo;
import com.project.ciberflix.service.IPeliculaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class IPeliculaServiceImpl implements IPeliculaService {

    @Autowired
    private IPeliculaRepo peliculaRepo;

    public List<Pelicula> listarPeliculas() {
        return peliculaRepo.findAll();
    }

    public Pelicula obtenerPelicula(Integer id) {
        return peliculaRepo.findById(id).get();
    }

    public Pelicula registrarPelicula(Pelicula p) {
        return peliculaRepo.save(p);
    }

    public Pelicula modificarPelicula(Pelicula p) {
        return peliculaRepo.save(p);
    }

    public String eliminarPelicula(Integer id) {
        peliculaRepo.deleteById(id);
        return "Pelicula eliminada correctamente";
    }
}

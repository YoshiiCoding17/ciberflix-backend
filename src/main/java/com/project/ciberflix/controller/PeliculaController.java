package com.project.ciberflix.controller;

import com.project.ciberflix.model.Pelicula;
import com.project.ciberflix.model.Usuario;
import com.project.ciberflix.service.IPeliculaService;
import lombok.AllArgsConstructor;
import org.aspectj.weaver.ast.Var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/pelicula")
public class PeliculaController {
    @Autowired
    private IPeliculaService peliculaService;

    @GetMapping
    @CrossOrigin(origins = "http://localhost:5173")
    public ResponseEntity<?> listarPeliculas() {
        List<Pelicula> peliculas = peliculaService.listarPeliculas();
        return new ResponseEntity<>(peliculas, peliculas.size() > 0 ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<?> obtenerPelicula(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(peliculaService.obtenerPelicula(id), HttpStatus.OK);
    }
    @PostMapping
    @CrossOrigin(origins = "http://localhost:5173")
    public ResponseEntity<?> registrarPelicula(@RequestBody Pelicula pelicula) {
        Pelicula newPelicula = peliculaService.registrarPelicula(pelicula);
        return new ResponseEntity<Pelicula>(newPelicula, HttpStatus.OK);
    }
    @PutMapping
    @CrossOrigin(origins = "http://localhost:5173")
    public ResponseEntity<?> modificarPelicula(@RequestBody Pelicula pelicula) {
        Pelicula newPelicula = peliculaService.modificarPelicula(pelicula);
        return new ResponseEntity<Pelicula>(newPelicula, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    @CrossOrigin(origins = "http://localhost:5173")
    public ResponseEntity<?> eliminarPelicula(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(peliculaService.eliminarPelicula(id), HttpStatus.OK);
    }
}

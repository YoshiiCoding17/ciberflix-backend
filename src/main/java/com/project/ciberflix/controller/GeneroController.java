package com.project.ciberflix.controller;

import com.project.ciberflix.model.Genero;
import com.project.ciberflix.service.IGeneroService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/generos")
public class GeneroController {
    @Autowired
    private IGeneroService generoService;

    @GetMapping
    @CrossOrigin(origins = "http://localhost:5173")
    public ResponseEntity<?> listarGeneros() {
        List<Genero> generos = generoService.listarGeneros();
        return new ResponseEntity<>(generos, generos.size() > 0 ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }
}

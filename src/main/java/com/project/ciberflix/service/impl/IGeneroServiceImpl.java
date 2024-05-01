package com.project.ciberflix.service.impl;

import com.project.ciberflix.model.Genero;
import com.project.ciberflix.repo.IGeneroRepo;
import com.project.ciberflix.service.IGeneroService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class IGeneroServiceImpl implements IGeneroService {

    @Autowired
    private IGeneroRepo generoRepo;
    @Override
    public List<Genero> listarGeneros() {
        return generoRepo.findAll();
    }
}

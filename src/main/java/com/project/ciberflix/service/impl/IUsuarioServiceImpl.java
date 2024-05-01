package com.project.ciberflix.service.impl;

import com.project.ciberflix.model.Usuario;
import com.project.ciberflix.repo.IUsuarioRepo;
import com.project.ciberflix.service.IUsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;


@Service
@AllArgsConstructor
public class IUsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private IUsuarioRepo usuarioRepo;

    public Usuario obtenerUsuario(Integer id) {
        return usuarioRepo.findById(id).get();
    }


    public Usuario obtenerUsuarioCorreoPassword(String correo, String password) {

        List<Usuario> us =  usuarioRepo.findAll().stream().filter(u -> u.getCorreo().equals(correo) && u.getPassword().equals(password)).toList();
        return us.size() == 1 ? us.get(0) : null;
    }

    public Usuario registrarUsuario(Usuario u) {
        return usuarioRepo.save(u);
    }

    public Usuario modificarUsuario(Usuario u) {
        return usuarioRepo.save(u);
    }

    public String eliminarUsuario(Integer id) {
        usuarioRepo.deleteById(id);
        return "Usuario eliminada correctamente";
    }

}

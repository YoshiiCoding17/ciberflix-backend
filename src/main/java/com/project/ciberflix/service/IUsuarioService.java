package com.project.ciberflix.service;

import com.project.ciberflix.model.Usuario;


public interface IUsuarioService {
    public Usuario obtenerUsuario(Integer id);
    public Usuario obtenerUsuarioCorreoPassword(String correo, String password);
    public Usuario modificarUsuario(Usuario u);
    public Usuario registrarUsuario(Usuario u);
    public String eliminarUsuario(Integer id);
}

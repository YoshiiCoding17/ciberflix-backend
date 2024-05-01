package com.project.ciberflix.controller;

import com.project.ciberflix.model.Usuario;
import com.project.ciberflix.service.IUsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/usuario")
public class UsuarioController {
    @Autowired
    private IUsuarioService usuarioService;


    @GetMapping(value = "/{id}")
    @CrossOrigin(origins = "http://localhost:5173")
    public ResponseEntity<?> obtenerUsuario(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(usuarioService.obtenerUsuario(id), HttpStatus.OK);
    }

    @PostMapping
    @CrossOrigin(origins = "http://localhost:5173")
    public ResponseEntity<?> registrarUsuario(@RequestBody Usuario usuario) {
        Usuario newUsuario = usuarioService.registrarUsuario(usuario);
        return new ResponseEntity<>(newUsuario, HttpStatus.OK);
    }
    @PostMapping("/login")
    @CrossOrigin(origins = "http://localhost:5173")
    public ResponseEntity<?> obtenerUsuario(@RequestBody Map<String, String> credenciales) {
        Usuario usuarioObtenido = usuarioService.obtenerUsuarioCorreoPassword(credenciales.get("correo"),credenciales.get("password"));
        Map<String,String> errorMensaje = new HashMap<>();
        errorMensaje.put("msj","Datos ingresados incorrectos");
        if(usuarioObtenido == null){
            return new ResponseEntity<>(errorMensaje, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(usuarioObtenido, HttpStatus.OK);
    }

    @PutMapping
    @CrossOrigin(origins = "http://localhost:5173")
    public ResponseEntity<?> modificarUsuario(@RequestBody Usuario usuario) {
        Usuario newUsuario = usuarioService.modificarUsuario(usuario);
        return new ResponseEntity<>(newUsuario, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> eliminarUsuario(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(usuarioService.eliminarUsuario(id), HttpStatus.OK);
    }
}

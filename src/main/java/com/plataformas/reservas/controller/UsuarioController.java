
package com.plataformas.reservas.controller;

import com.plataformas.reservas.model.Usuario;
import com.plataformas.reservas.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    @Autowired
    IUsuarioService usuarioServ;
    
    
    @GetMapping("/usuario/traer")
    public List<Usuario> getUsuario(){
        return usuarioServ.getUsuario();
    }
    
    @GetMapping("/usuario/traer/{id_usuario}")
    public Usuario findUsuario(@PathVariable Long id_usuario){
        return usuarioServ.findUsuario(id_usuario);       
    }
    
    @PostMapping("/usuario/crear")
    public String saveUsuario(@RequestBody Usuario usuario){
        usuarioServ.saveUsuario(usuario);
        return "Usuario creado correctamente";
    }
    
    @PutMapping("/usuario/editar")
    public String editUsuario(@RequestBody Usuario usuario){
        usuarioServ.editUsuario(usuario);
        return "Usuario editado correctamente";
    }
    
    @DeleteMapping("/usuario/borrar/{id_usuario}")
    public String deleteUsuario(@PathVariable Long id_usuario){
        usuarioServ.deleteUsuario(id_usuario);
        return "Usuario eliminado correctamente";
    }
    
}

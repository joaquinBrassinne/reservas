
package com.plataformas.reservas.service;

import com.plataformas.reservas.model.Usuario;
import com.plataformas.reservas.repository.IUsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService{
    
    @Autowired
    IUsuarioRepository usuarioRepo;

    @Override
    public List<Usuario> getUsuario() {
        List<Usuario> listaUsuario = usuarioRepo.findAll();
        return listaUsuario;
    }

    @Override
    public Usuario findUsuario(Long id_usuario) {
        Usuario usu = usuarioRepo.findById(id_usuario).orElse(null);
        return usu;
    }

    @Override
    public void editUsuario(Usuario usuario) {
        this.saveUsuario(usuario);
    }

    @Override
    public void saveUsuario(Usuario usuario) {
        usuarioRepo.save(usuario);
    }

    @Override
    public void deleteUsuario(Long id_usuario) {
        usuarioRepo.deleteById(id_usuario);
    }
    
}

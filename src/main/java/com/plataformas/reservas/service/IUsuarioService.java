
package com.plataformas.reservas.service;

import com.plataformas.reservas.model.Usuario;
import java.util.List;


public interface IUsuarioService {
    public List<Usuario> getUsuario();
    public Usuario findUsuario(Long id_usuario);
    public void editUsuario(Usuario usuario);
    public void saveUsuario(Usuario usuario);
    public void deleteUsuario(Long id_usuario);
}

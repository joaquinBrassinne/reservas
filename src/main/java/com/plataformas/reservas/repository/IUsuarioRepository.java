
package com.plataformas.reservas.repository;

import com.plataformas.reservas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IUsuarioRepository extends JpaRepository<Usuario,Long>{
    
}

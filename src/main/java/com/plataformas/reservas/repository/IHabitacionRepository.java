
package com.plataformas.reservas.repository;

import com.plataformas.reservas.model.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHabitacionRepository  extends JpaRepository <Habitacion,Long>{
    
}

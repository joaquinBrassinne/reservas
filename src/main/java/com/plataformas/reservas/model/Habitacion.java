
package com.plataformas.reservas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Habitacion {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id_habitacion;
    private String numero_habitacion;
    private String estado;

    public Habitacion() {
    }

    public Habitacion(Long id_habitacion, String numero_habitacion, String estado) {
        this.id_habitacion = id_habitacion;
        this.numero_habitacion = numero_habitacion;
        this.estado = estado;
    }
    
    
    
    
}

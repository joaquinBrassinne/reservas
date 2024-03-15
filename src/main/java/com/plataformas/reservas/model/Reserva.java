
package com.plataformas.reservas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Reserva {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id_reserva;
    private LocalDate fecha_creacion;
    private LocalDate fecha_salida;

    public Reserva() {
    }

    public Reserva(Long id_reserva, LocalDate fecha_creacion, LocalDate fecha_salida) {
        this.id_reserva = id_reserva;
        this.fecha_creacion = fecha_creacion;
        this.fecha_salida = fecha_salida;
    }
    
    
}

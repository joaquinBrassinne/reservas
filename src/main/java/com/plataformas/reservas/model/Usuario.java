
package com.plataformas.reservas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Usuario {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id_usuario;
    private String nombre;
    private String apellido;
    private String dni;
    private String numero_telefono;
    
    @OneToOne
    @JoinColumn(name = "idReserva",
            referencedColumnName = "id_reserva")
    private Reserva Unareserva;
    
    @OneToOne
    @JoinColumn(name = "idHabitacion",
            referencedColumnName = "id_habitacion")
    private Habitacion Unahabitacion;

    public Usuario() {
    }

    public Usuario(Long id_usuario, String nombre, String apellido, String dni, String numero_telefono, Reserva Unareserva, Habitacion Unahabitacion) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.numero_telefono = numero_telefono;
        this.Unareserva = Unareserva;
        this.Unahabitacion = Unahabitacion;
    }
    
    
    
}

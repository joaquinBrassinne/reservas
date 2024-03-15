
package com.plataformas.reservas.service;

import com.plataformas.reservas.model.Reserva;
import java.time.LocalDate;
import java.util.List;


public interface IReservaService {
    public List<Reserva> getReserva();
    public Reserva findReserva(Long id_reserva);
    public void editReserva(Reserva reserva);
    public void saveReserva(Reserva reserva);
    public void deleteReserva(Long id_reserva);
    public List<Reserva> findFecha(LocalDate fecha_creacion);
    public List<Reserva> findFechaSalida(LocalDate fecha_salida);
   
}


package com.plataformas.reservas.service;

import com.plataformas.reservas.model.Habitacion;
import java.util.List;


public interface IHabitacionService {
    public List<Habitacion> getHabitacion();
    public Habitacion findHabitacion(Long id_habitacion);
    public void editHabitacion(Habitacion habitacion);
    public void saveHabitacion(Habitacion habitacion);
    public void deleteHabitacion(Long id_habitacion);
    public List<Habitacion> habitacionDesocupada();
    public List<Habitacion> habitacionOcupada();
}

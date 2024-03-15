
package com.plataformas.reservas.service;

import com.plataformas.reservas.model.Habitacion;
import com.plataformas.reservas.repository.IHabitacionRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabitacionService implements IHabitacionService{
    
    @Autowired
    private IHabitacionRepository habitacionRepo;

    @Override
    public List<Habitacion> getHabitacion() {
        List<Habitacion> listaHabitacion =  habitacionRepo.findAll();
        
        return listaHabitacion;
    }

    @Override
    public Habitacion findHabitacion(Long id_habitacion) {
        Habitacion habi = habitacionRepo.findById(id_habitacion).orElse(null);
        return habi;
    }

    @Override
    public void editHabitacion(Habitacion habitacion) {
        this.saveHabitacion(habitacion);
    }

    @Override
    public void saveHabitacion(Habitacion habitacion) {
        habitacionRepo.save(habitacion);
    }

    @Override
    public void deleteHabitacion(Long id_habitacion) {
        habitacionRepo.deleteById(id_habitacion);
    }

    @Override
    public List<Habitacion> habitacionDesocupada() {
        List<Habitacion> listaHabitaciones = this.getHabitacion();
        List<Habitacion> listaHabitacionesDesocupadas = new ArrayList<>();
        
        for(Habitacion habitacion: listaHabitaciones){
            String palabra = "desocupada";
            if(habitacion.getEstado().contains(palabra)){
                listaHabitacionesDesocupadas.add(habitacion);
            }
        
        }
        return listaHabitacionesDesocupadas;
    }

    @Override
    public List<Habitacion> habitacionOcupada() {
        List<Habitacion> listaHabitaciones = this.getHabitacion();
        List<Habitacion> listaHabitacionesOcupadas = new ArrayList<>();
        
        for(Habitacion habitacion: listaHabitaciones){
            String palabra = "ocupada";
            if(habitacion.getEstado().contains(palabra)){
                listaHabitacionesOcupadas.add(habitacion);
            }
        
        }
        return listaHabitacionesOcupadas;
    }
}
    


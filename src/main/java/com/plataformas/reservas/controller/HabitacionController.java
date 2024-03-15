package com.plataformas.reservas.controller;

import com.plataformas.reservas.model.Habitacion;
import com.plataformas.reservas.service.IHabitacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HabitacionController {

    @Autowired
    private IHabitacionService habitacionServ;

    @GetMapping("/habitacion/traer")
    public List<Habitacion> getHabitacion() {
        return habitacionServ.getHabitacion();
    }

    @GetMapping("/habitacion/traer/{id_habitacion}")
    public Habitacion findHabitacion(@PathVariable Long id_habitacion) {
        return habitacionServ.findHabitacion(id_habitacion);
    }
    
    @GetMapping("/habitacion/traer/desocupada")
    public List<Habitacion> findHabitacionDesocupada(){
        return habitacionServ.habitacionDesocupada();
    }
    
    @GetMapping("/habitacion/traer/desocupada")
    public List<Habitacion> findHabitacionOcupada(){
        return habitacionServ.habitacionOcupada();
    }
    
    @PostMapping("/habitacion/crear")
    public String saveHabitacion(@RequestBody Habitacion habitacion){
        habitacionServ.saveHabitacion(habitacion);
        return "Habitacion creada correctamente";
    }
    
    @PutMapping("/habitacion/editar")
    public String editHabitacion(@RequestBody Habitacion habitacion){
        habitacionServ.editHabitacion(habitacion);
        return "Habitacion editada correctamente";
    }
    
    @DeleteMapping("/habitacion/borrar/{id_habitacion}")
     public String deleteHabitacion(@PathVariable Long id_habitacion){
        habitacionServ.deleteHabitacion(id_habitacion);
        return "Habitacion eliminada correctamente";
     }
            
}

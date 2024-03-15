
package com.plataformas.reservas.controller;

import com.plataformas.reservas.model.Reserva;
import com.plataformas.reservas.service.IReservaService;
import java.time.LocalDate;
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
public class ReservaController {
    
    @Autowired
    IReservaService reservaServ;
    
    @GetMapping("/reserva/traer")
    public List<Reserva> getReserva(){
        return reservaServ.getReserva();
    }
    
    @GetMapping("reserva/traer/{id_reserva}")
    public Reserva findReserva(@PathVariable Long id_reserva){
        return reservaServ.findReserva(id_reserva);
    }
    
    @GetMapping("/reserva/traer/{fecha_creacion}")
    public List<Reserva> getFechaCreacion(@PathVariable LocalDate fecha_creacion){
        return reservaServ.findFecha(fecha_creacion);
    }
    
    @GetMapping("/reserva/traer/{fecha_salida}")
    public List<Reserva> getFechaSalida(@PathVariable LocalDate fecha_salida){
        return reservaServ.findFecha(fecha_salida);
    }
    
    @PostMapping("reserva/crear")
    public String saveReserva(@RequestBody Reserva reserva){
        reservaServ.saveReserva(reserva);
        return "Reserva creada correctamente";
    }
    
    @PutMapping("/reserva/editar")
    public String editReserva(@RequestBody Reserva reserva){
        reservaServ.editReserva(reserva);
        return "reserva editada correctamente";
    }
    
    @DeleteMapping("/reserva/borrar/{id_reserva}")
    public String deleteReserva(@PathVariable Long id_reserva){
        reservaServ.deleteReserva(id_reserva);
        return "reserva eliminada correctamente";
    }
        

            
            
    
    
    
}

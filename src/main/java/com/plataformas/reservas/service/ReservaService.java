package com.plataformas.reservas.service;

import com.plataformas.reservas.model.Reserva;
import com.plataformas.reservas.repository.IReservaRepository;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaService implements IReservaService {
    @Autowired
    IReservaRepository reservaRepo;

    @Override
    public List<Reserva> getReserva() {
        List<Reserva> listaReserva = reservaRepo.findAll();
        return listaReserva;
    }

    @Override
    public Reserva findReserva(Long id_reserva) {
        Reserva reserva = reservaRepo.findById(id_reserva).orElse(null);
        return reserva;
    }

    @Override
    public void editReserva(Reserva reserva) {
        this.saveReserva(reserva);
    }

    @Override
    public void saveReserva(Reserva reserva) {
        reservaRepo.save(reserva);
    }

    @Override
    public void deleteReserva(Long id_reserva) {
        reservaRepo.deleteById(id_reserva);
    }

    @Override
    public List<Reserva> findFecha(LocalDate fecha_creacion) {
        List<Reserva> listaReserva = this.getReserva();
        
        for(Reserva reser: listaReserva){
            reser.getFecha_creacion();
            return listaReserva;
        }   
        return listaReserva;
    }

    @Override
    public List<Reserva> findFechaSalida(LocalDate fecha_salida) {
        List<Reserva> listaReserva = this.getReserva();
        
        for(Reserva reser: listaReserva){
            reser.getFecha_salida();
            return listaReserva;
        }
        return listaReserva;
    }

   
    
}

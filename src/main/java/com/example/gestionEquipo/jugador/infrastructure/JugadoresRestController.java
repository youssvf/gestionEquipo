package com.example.gestionEquipo.jugador.infrastructure;

import com.example.gestionEquipo.jugador.aplication.JugadoresUseCases;
import com.example.gestionEquipo.jugador.domain.Jugador;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class JugadoresRestController {
    private JugadoresUseCases jugadoresUseCases;

    public JugadoresRestController(){
        this.jugadoresUseCases = new JugadoresUseCases(new JugadoresRepositorySQL());
    }

    @GetMapping("/api/jugadores")
    public List<Jugador> getAll(){
        List<Jugador> jugadores = this.jugadoresUseCases.getAll();
        return jugadores;
    }
}

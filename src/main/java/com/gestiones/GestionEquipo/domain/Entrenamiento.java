package com.gestiones.GestionEquipo.domain;

import java.util.Date;
import java.util.List;

public class Entrenamiento {
    private Integer id;
    private Date fecha;
    private List<Ejercicio> ejercicios;
    private List<Jugador> jugadores;

    public Entrenamiento(Integer id, Date fecha, List<Ejercicio> ejercicios, List<Jugador> jugadores) {
        this.id = id;
        this.fecha = fecha;
        this.ejercicios = ejercicios;
        this.jugadores = jugadores;
    }

    public Integer getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public List<Ejercicio> getEjercicios() {
        return ejercicios;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }
}

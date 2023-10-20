package com.gestiones.GestionEquipo.jugador.domain;

import java.util.List;

public interface JugadoresRepository {
    public List<Jugador> getAll();
    public Jugador getByDNI(Integer dni);
    Jugador agregarJugador(Jugador jugador);
    Jugador actualizarJugador(Integer dni, Jugador jnuevo);

}

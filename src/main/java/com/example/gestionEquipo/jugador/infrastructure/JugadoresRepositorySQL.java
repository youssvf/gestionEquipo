package com.example.gestionEquipo.jugador.infrastructure;

import com.example.gestionEquipo.DBConnection;
import com.example.gestionEquipo.jugador.domain.Jugador;
import com.example.gestionEquipo.jugador.domain.JugadoresRepository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JugadoresRepositorySQL implements JugadoresRepository {
    public JugadoresRepositorySQL(){}

    public List<Jugador> getAll(){
        List<Jugador> jugadores = new ArrayList<>();

        try {
            Statement stmnt = DBConnection.getInstance().createStatement();
            ResultSet rs = stmnt.executeQuery("SELECT * FROM jugadores");
            while(rs.next()){
                String dni = rs.getString("dni");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                Date fechaNac = rs.getDate("fechaNac");
                Integer resistencia = rs.getInt("resistencia");
                Integer velocidad = rs.getInt("velocidad");
                Integer recuperacion = rs.getInt("recuperacion");

                jugadores.add(new Jugador(dni,nombre,apellidos,fechaNac,resistencia,velocidad,recuperacion));
            }
        } catch (SQLException e) {
            System.err.println(e);
        }

        return jugadores;
    }

    @Override
    public Jugador getByDNI(String dni) {
        Jugador jugador = null;
        Statement stmnt = null;
        try {
            stmnt = DBConnection.getInstance().createStatement();
            ResultSet rs = stmnt.executeQuery("SELECT * FROM jugadores WHERE dni = '" + dni + "';");
            while (rs.next()){
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                Date fechaNac = rs.getDate("fechaNac");
                Integer resistencia = rs.getInt("resistencia");
                Integer velocidad = rs.getInt("velocidad");
                Integer recuperacion = rs.getInt("recuperacion");

                jugador = new Jugador(dni,nombre,apellidos,fechaNac,resistencia,velocidad,recuperacion);
            }
        } catch (SQLException e) {
            System.err.println(e);
        }

        return jugador;
    }

    @Override
    public Jugador agregarJugador(Jugador jugador) {
        return null;
    }

    @Override
    public Jugador actualizarJugador(Integer dni, Jugador jnuevo) {
        return null;
    }
}

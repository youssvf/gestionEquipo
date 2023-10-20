package com.gestiones.GestionEquipo.domain;

import java.util.List;

public class Ejercicio {
    private Integer id, duracion, resistencia, velocidad, recuperacion;
    private String titulo, descripcion;
    private List<Material> materiales;
    private List<Recurso> recursos;

    public Ejercicio(Integer id, Integer duracion, Integer resistencia, Integer velocidad, Integer recuperacion, String titulo, String descripcion, List<Material> materiales, List<Recurso> recursos) {
        this.id = id;
        this.duracion = duracion;
        this.resistencia = resistencia;
        this.velocidad = velocidad;
        this.recuperacion = recuperacion;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.materiales = materiales;
        this.recursos = recursos;
    }

    public Integer getId() {
        return id;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public Integer getResistencia() {
        return resistencia;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public Integer getRecuperacion() {
        return recuperacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<Material> getMateriales() {
        return materiales;
    }

    public List<Recurso> getRecursos() {
        return recursos;
    }
}

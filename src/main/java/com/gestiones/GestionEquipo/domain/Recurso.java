package com.gestiones.GestionEquipo.domain;

public class Recurso {
    private Integer id;
    private String url;

    public Recurso(Integer id, String url) {
        this.id = id;
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }
}

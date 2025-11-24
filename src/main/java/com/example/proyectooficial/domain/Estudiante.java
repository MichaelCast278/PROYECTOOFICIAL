package com.example.proyectooficial.domain;

public class Estudiante {

    private String codigo;
    private boolean asistenciaMinima;

    public Estudiante(String codigo, boolean asistenciaMinima) {
        this.codigo = codigo;
        this.asistenciaMinima = asistenciaMinima;
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean hasAsistenciaMinima() {
        return asistenciaMinima;
    }
}

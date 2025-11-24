package com.example.proyectooficial.domain;

import java.util.List;

public class StudentRecord {

    private Estudiante estudiante;
    private List<Evaluation> evaluaciones;
    private ExtraPointsPolicy extraPolicy;

    public StudentRecord(Estudiante estudiante,
                         List<Evaluation> evaluaciones,
                         ExtraPointsPolicy extraPolicy) {

        this.estudiante = estudiante;
        this.evaluaciones = evaluaciones;
        this.extraPolicy = extraPolicy;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public List<Evaluation> getEvaluaciones() {
        return evaluaciones;
    }

    public ExtraPointsPolicy getExtraPolicy() {
        return extraPolicy;
    }
}

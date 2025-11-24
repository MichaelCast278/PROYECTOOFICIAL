package com.example.proyectooficial.presentation;

import java.util.List;

public record GradeRequest(
        String codigoEstudiante,
        boolean asistenciaMinima,
        boolean puntosExtra,
        List<EvaluacionRequest> evaluaciones
) {
}

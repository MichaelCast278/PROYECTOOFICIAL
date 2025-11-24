package com.example.proyectooficial.presentation;

import com.example.proyectooficial.application.GradeCalculatorService;
import com.example.proyectooficial.domain.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/grade")
public class GradeController {

    private final GradeCalculatorService gradeService;

    public GradeController(GradeCalculatorService gradeService) {
        this.gradeService = gradeService;
    }

    @PostMapping("/calcular")
    public double calcular(@RequestBody GradeRequest request) {

        Estudiante estudiante = new Estudiante(
                request.codigoEstudiante(),
                request.asistenciaMinima()
        );

        List<Evaluation> evaluaciones = request.evaluaciones().stream()
                .map(e -> new Evaluation(e.nota(), e.peso()))
                .toList();

        StudentRecord record = new StudentRecord(
                estudiante,
                evaluaciones,
                new ExtraPointsPolicy(request.puntosExtra())
        );

        return gradeService.calcularNotaFinal(record);
    }
}

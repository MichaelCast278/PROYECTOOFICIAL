package com.example.proyectooficial.application;

import com.example.proyectooficial.domain.*;
import org.springframework.stereotype.Service;

@Service
public class GradeCalculatorService {

    public double calcularNotaFinal(StudentRecord record) {

        // RF02 — asistencia mínima obligatoria
        if (!record.getEstudiante().hasAsistenciaMinima())
            return 0;

        // RF01 — límite máximo 10 evaluaciones
        if (record.getEvaluaciones().size() > 10)
            throw new IllegalArgumentException("Máximo 10 evaluaciones permitidas");

        double suma = 0;

        // RF04 — promediado ponderado
        for (Evaluation e : record.getEvaluaciones()) {
            if (e.getWeight() < 0 || e.getWeight() > 1)
                throw new IllegalArgumentException("Peso inválido (debe ser 0..1)");

            suma += e.getScore() * e.getWeight();
        }

        // RF05 — aplicar puntos extra
        if (record.getExtraPolicy().applies()) {
            suma += 1; // 1 punto extra definido por política
        }

        // Limitar entre 0 y 20
        return Math.min(20, Math.max(0, suma));
    }
}

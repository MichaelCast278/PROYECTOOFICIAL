package com.example.proyectooficial.domain;

public class Evaluation {

    private double score;   // Nota de la evaluación (0 a 20)
    private double weight;  // Peso de la evaluación (0 a 1)

    public Evaluation(double score, double weight) {
        this.score = score;
        this.weight = weight;
    }

    public double getScore() {
        return score;
    }

    public double getWeight() {
        return weight;
    }
}

package com.example.proyectooficial.domain;

public class ExtraPointsPolicy {

    private boolean applies; // Indica si se aplican puntos extra o no

    public ExtraPointsPolicy(boolean applies) {
        this.applies = applies;
    }

    public boolean applies() {
        return applies;
    }
}

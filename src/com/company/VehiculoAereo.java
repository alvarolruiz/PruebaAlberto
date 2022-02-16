package com.company;

public abstract class VehiculoAereo extends Vehiculo{
    private int numeroAlas;

    public VehiculoAereo(int ocupantes, String color, int numeroAlas) {
        super(ocupantes, color);
        this.numeroAlas = numeroAlas;
    }
}

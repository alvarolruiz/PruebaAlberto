package com.company;

public abstract class Vehiculo {
    private int ocupantes;
    private String color;

    public Vehiculo(int ocupantes, String color) {
        this.ocupantes = ocupantes;
        this.color = color;
    }

    public Vehiculo() {
        this.ocupantes=0;
        this.color="invisible";
    }

    public int getOcupantes() {
        return ocupantes;
    }

    public void setOcupantes(int ocupantes) {
        this.ocupantes = ocupantes;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "ocupantes=" + ocupantes +
                ", color='" + color + '\'' +
                '}';
    }
}

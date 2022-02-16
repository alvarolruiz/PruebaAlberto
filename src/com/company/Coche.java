package com.company;

public class Coche extends VehiculoTerrestre{
    private String marca;

    public Coche(int ocupantes, String color, int nRuedads, String marca) {
        super(ocupantes, color, nRuedads);
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", nRuedads=" + nRuedads +
                '}';
    }
}

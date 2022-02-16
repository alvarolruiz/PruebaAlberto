package com.company;
//Esta clase es hija de Vehiculo y se indica con extends
public abstract class VehiculoTerrestre extends Vehiculo{
    public int nRuedads;

    public VehiculoTerrestre(int ocupantes, String color, int nRuedads) {
        super(ocupantes, color);
        this.nRuedads = nRuedads;
    }
}

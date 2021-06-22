package Polimorfismo;

import java.awt.*;

public class VehiculoTurismo extends Vehiculo{
    protected int numPuertas;

    public VehiculoTurismo(int matricula, String marca, int modelo, int numPuertas) {
        super(matricula, marca, modelo);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
}

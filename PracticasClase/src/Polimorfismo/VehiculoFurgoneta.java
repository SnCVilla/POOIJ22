package Polimorfismo;

public class VehiculoFurgoneta extends Vehiculo{
    protected int carga;

    public VehiculoFurgoneta(int matricula, String marca, int modelo, int carga) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
}

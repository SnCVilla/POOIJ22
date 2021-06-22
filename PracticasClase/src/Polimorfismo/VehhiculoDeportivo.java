package Polimorfismo;

public class VehhiculoDeportivo extends Vehiculo{
    protected int Cilindrada;

    public VehhiculoDeportivo(int matricula, String marca, int modelo, int cilindrada) {
        super(matricula, marca, modelo);
        Cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return Cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        Cilindrada = cilindrada;
    }
}

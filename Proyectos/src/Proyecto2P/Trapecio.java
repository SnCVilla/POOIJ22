package Proyecto2P;

public class Trapecio extends Cuadrilatero{
    protected double AlturaT;

    public Trapecio(double x, double y, int vertices, double alturaT) {
        super(x, y, vertices);
        AlturaT = alturaT;
    }

    public double getAlturaT() {
        return AlturaT;
    }

    public void setAlturaT(double alturaT) {
        AlturaT = alturaT;
    }
}

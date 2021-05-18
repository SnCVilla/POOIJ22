package Proyecto2P;


public class Rectangulo extends Cuadrilatero{
    protected double AlturaR;

    public Rectangulo(double x, double y, int vertices, double alturaR) {
        super(x, y, vertices);
        AlturaR = alturaR;
    }

    public Rectangulo(double x, double y, int vertices) {
        super(x, y, vertices);
    }

    public double getAlturaR() {
        return AlturaR;
    }

    public void setAlturaR(double alturaR) {
        AlturaR = alturaR;
    }

    public Rectangulo() {
        super();
    }
}

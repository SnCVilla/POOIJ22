package Proyecto2P;

public abstract class Cuadrilatero {
    protected double x,y;
    protected int vertices;


    public Cuadrilatero(double x, double y, int vertices) {
        this.x = x;
        this.y = y;
        this.vertices = vertices;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getVertices() {
        return vertices;
    }

    public void setVertices(int vertices) {
        this.vertices = vertices;
    }

    public Cuadrilatero() {


    }
}

package Polimorfismo;

public class Vehiculo {

    protected int Matricula;
    protected String Marca;
    protected int Modelo;



    public void MostrarDatos() {

    }
    public Vehiculo(int matricula, String marca, int modelo) {
        Matricula = matricula;
        Marca = marca;
        Modelo = modelo;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int matricula) {
        Matricula = matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getModelo() {
        return Modelo;
    }

    public void setModelo(int modelo) {
        Modelo = modelo;
    }
}

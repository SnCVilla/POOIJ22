package PracticaPersona;

public abstract class Persona implements MetodosPersona{
    private String Nombre;
    private String Apellido;
    private int Edad;
    private int Peso;
    private double Estatura;
    private String Domicilio;
    private String Nacionalidad;

    public Persona(){

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int peso) {
        Peso = peso;
    }

    public double getEstatura() {
        return Estatura;
    }

    public void setEstatura(double estatura) {
        Estatura = estatura;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        Nacionalidad = nacionalidad;
    }
    public void MostrarNombre(){

    }
}




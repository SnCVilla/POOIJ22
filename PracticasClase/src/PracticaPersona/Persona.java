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
        this.Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        this.Edad = edad;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int peso) {
        this.Peso = peso;
    }

    public double getEstatura() {
        return Estatura;
    }

    public void setEstatura(double estatura) {
        this.Estatura = estatura;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.Domicilio = domicilio;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.Nacionalidad = nacionalidad;
    }
}




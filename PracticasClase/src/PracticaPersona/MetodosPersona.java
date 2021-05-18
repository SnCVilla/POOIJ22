package PracticaPersona;

public interface MetodosPersona {
    public String getNombre();
    public void setNombre(String nombre);
    public String getApellido();
    public void setApellido(String apellido);
    public int getEdad();
    public void setEdad(int edad);
    public int getPeso();
    public void setPeso(int peso);
    public double getEstatura();
    public void setEstatura(double estatura);
    public String getDomicilio();
    public void setDomicilio(String domicilio);
    public String getNacionalidad();
    public void setNacionalidad(String nacionalidad);
    public default void Nombres(){

    }
}

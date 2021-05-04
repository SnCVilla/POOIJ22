package PracticaPersona;

public class Usuario extends Persona{
    private String Email;
    private String Contraseña;

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public String getApellido() {
        return super.getApellido();
    }

    @Override
    public int getEdad() {
        return super.getEdad();
    }

    @Override
    public int getPeso() {
        return super.getPeso();
    }

    @Override
    public double getEstatura() {
        return super.getEstatura();
    }

    @Override
    public String getDomicilio() {
        return super.getDomicilio();
    }

    @Override
    public String getNacionalidad() {
        return super.getNacionalidad();
    }
}

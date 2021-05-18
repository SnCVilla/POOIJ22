package PracticaPersona;

public class Administrador extends Persona {
    private String IdAdmin;
    private String kontrasenaAdm;
    private String EmailAdm;

    public String getIdAdmin() {
        return IdAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        IdAdmin = idAdmin;
    }

    public String getKontrasenaAdm() {
        return kontrasenaAdm;
    }

    public void setKontrasenaAdm(String kontrasenaAdm) {
        this.kontrasenaAdm = kontrasenaAdm;
    }

    public String getEmailAdm() {
        return EmailAdm;
    }

    public void setEmailAdm(String emailAdm) {
        EmailAdm = emailAdm;
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

    @Override
    public void Nombres() {

    }
}

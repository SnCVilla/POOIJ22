public class Familia {
    private String Nombre;
    private String ApellidoMaterno;
    private String ApellidoPaterno;
    private String FechaNacimiento;
    private String LugarNacimiento;

    public String getNombre() {
        return Nombre;  
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        ApellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        ApellidoPaterno = apellidoPaterno;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public String getLugarNacimiento() {
        return LugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        LugarNacimiento = lugarNacimiento;
    }
}

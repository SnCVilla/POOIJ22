package PracticaPersona;

public class Cliente extends Persona{
    private String IdCliente;
    private int ComprasTotales;
    private String Antiguedad;

    public String getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(String idCliente) {
        IdCliente = idCliente;
    }

    public int getComprasTotales() {
        return ComprasTotales;
    }

    public void setComprasTotales(int comprasTotales) {
        ComprasTotales = comprasTotales;
    }

    public String getAntiguedad() {
        return Antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        Antiguedad = antiguedad;
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

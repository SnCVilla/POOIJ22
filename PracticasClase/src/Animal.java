public abstract class Animal implements ComportamientoAnimal{
    protected String color;
    protected String especie;

//    public abstract void setColor();

  //  public abstract void setColor(String color);

    //public abstract void setEspecie();

    //public abstract void setEspecie(String especie);

    public Animal(){

    }
    public Animal(String color){
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getEspecie() {
        return especie;
    }

    @Override
    public void setEspecie(String especie) {
        this.especie = especie;
    }
}

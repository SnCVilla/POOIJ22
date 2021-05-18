package TUTO1;

public abstract class Matematica {
    private int num11;
    private int num2;
    private int num3;
    private int num4;

    public Matematica(int num11, int num2, int num3, int num4) {
        this.num11 = num11;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }

    public int getNum11() {
        return num11;
    }

    public void setNum11(int num11) {
        this.num11 = num11;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getNum4() {
        return num4;
    }

    public void setNum4(int num4) {
        this.num4 = num4;
    }

    public void Operacion(){

    }
    public void MostrarResultado(){


    }
}

package Proyecto2P;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MainCuadrilateros {
    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);

        Cuadrado cuadrado = new Cuadrado(5,5,4);
        Rectangulo rectangulo = new Rectangulo(5, 3, 4,6);
        Trapecio trapecio = new Trapecio(5, 3, 4, 4);
        System.out.println("--------------------------------------");
        System.out.println("El area de las figuras es la siguiente: ");
        System.out.println("---------------------------------------");
        System.out.println("El area del cuadrado es: ");
        System.out.println(cuadrado.getX()*cuadrado.getY());
        System.out.println("------------------------------------");
        System.out.println("El area del Rectagulo es: ");
        System.out.println(rectangulo.getX()*rectangulo.getAlturaR());
        System.out.println("---------------------------------------");
        System.out.println("El area del trapecio es: ");
        System.out.println(trapecio.getX()+trapecio.getY()*trapecio.getAlturaT()/2);
    }
}


package OPERACIONES;

import java.util.Scanner;

//public class OperaMain {
  //  public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

         int a;
         int b;
         int sumaa;
         int resta;
         double BaseMayor;
         double BaseMenor;
         double Altura;
         double AreaT;
         double AreaR;




        System.out.println("Ingresa el valor de a: ");
        a = sc.nextInt();
        System.out.println("Ingresa el valor de b ");
        b = sc.nextInt();
        System.out.println("Ingresa la Base Mayor");
        BaseMayor = sc.nextDouble();
        System.out.println("Ingresa la Base Menor");
        BaseMenor = sc.nextDouble();
        System.out.println("Ingresa la ALtura");
        Altura = sc.nextDouble();


        sumaa = a+b;
        resta = a-b;
        AreaT = (BaseMayor+BaseMenor)*(Altura)/2;
        AreaR = (BaseMayor * BaseMenor);



        System.out.println("La suma de a y b es: " + sumaa);
        System.out.println("La suma de a y b es: " + resta);
        System.out.println("La Area del trapecio es: "+AreaT);
        System.out.println("La Area del trapecio es: "+AreaR);
//AREA DEL TRAPECIO BASE MAYOR + BASE MENOR * ALTURA /2


    }
}

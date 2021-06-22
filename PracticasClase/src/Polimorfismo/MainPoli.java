package Polimorfismo;

import static javax.swing.text.html.parser.DTDConstants.GENERAL;

public class MainPoli {
    public static void main(String[] args) {

        Vehiculo Mivehiculo2 = new VehiculoTurismo(8765,"FORD",2,4);


        Vehiculo Mivehiculo3 = new VehhiculoDeportivo(947,"MAZDA",2021,2488);


        Vehiculo MiVehiculo4 = new VehiculoFurgoneta(98765,"TORTON", 2011,2500);



        Vehiculo Mivehiculo4 = new Vehiculo(97329,"General",2020);


        System.out.println(" El vehiculo de Turusmo es marca: "+Mivehiculo2.Marca+ "Y de matricula: "+Mivehiculo2.Matricula+
                "Su modelo es del año: "+Mivehiculo2.Modelo);

    }
}
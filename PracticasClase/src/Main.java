public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        perro.setColor("Cafe");
        perro.setEspecie("Chihuaha");
        Lobo lobo = new Lobo();
        lobo.setColor("Gris");
        lobo.setEspecie("Lobo Gris");
        Gato gato = new Gato();
        gato.setColor("Camel");
        gato.setEspecie("Burmes");
        Tigre tigre = new Tigre();
        tigre.setColor("Albino");
        tigre.setEspecie("Malayo");
        Aguila aguila = new Aguila();
        aguila.setColor("marron y la cabeza blanca");
        aguila.setEspecie("Aguila calva");
        Paloma paloma = new Paloma();
        paloma.setEspecie("Paloma Bravia");
        paloma.setColor("Gris azulado");
        Trucha trucha = new Trucha();
        trucha.setEspecie("Trucha de cuello cortado");
        trucha.setColor("piel entre naranja y dorada con puntos negros y plateados");
        Salmon salmon = new Salmon();
        salmon.setColor("Azul verdoso metalico");
        salmon.setEspecie("Salmon Keta");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("A continuacion se muestra las siguientes especies de animales ");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("FAMILIA MAMIFERO CANINOS");
        System.out.println("El perro es raza " + perro.getEspecie() + " y es color " + perro.getColor());
        System.out.println("La especie " + lobo.getEspecie() + " es color " + lobo.getColor());
        System.out.println("-------------------------------------------------------------------");
        System.out.println("FAMILIA MAMIFERO FELINOS");
        System.out.println("El gato es raza " + gato.getEspecie() + " y es de color " + gato.getColor());
        System.out.println("El tigre de la especie " + tigre.getEspecie() + " uno de muchos resulto ser " + tigre.getColor());
        System.out.println("-------------------------------------------------------------------");
        System.out.println("FAMILIA OVIPAROS AVES");
        System.out.println("El " + aguila.getEspecie() + " es de color " + aguila.getColor());  
        System.out.println("La " + paloma.getEspecie() + " tiene un plumaje de color " + paloma.getColor());
        System.out.println("-------------------------------------------------------------------");
        System.out.println("FAMILIA OVIPAROS PEZ");
        System.out.println("La "+trucha.getEspecie()+" es de "+trucha.getColor());
        System.out.println("El "+salmon.getEspecie()+" tiene un tono de escamas color "+salmon.getColor());
        System.out.println("-------------------------------------------------------------------");

       }
    }


package intro;

import java.util.Scanner;

public class holaDatos {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre, edad y altura");

        String nom = scanner.next();

        int edad = scanner.nextInt();

        double altura = scanner.nextDouble();

        System.out.println("Nombre: "+nom+ " Edad: "+edad+ " Atura: "+altura);


    }
}

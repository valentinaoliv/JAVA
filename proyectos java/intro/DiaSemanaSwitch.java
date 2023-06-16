package intro;

import java.util.Scanner;

public class DiaSemanaSwitch {
    public static void main (String [] args){
        Scanner scanner =new Scanner(System.in);

        System.out.print("Ingrese un dia de la semana numero: ");
        int num =scanner.nextInt();

        String dia;

        switch (num){

            case 1:
                dia="Lunes";
                break;
            case 2:
                dia="Mares";
                break;
            case 3:
                dia="Miercoles";
                break;
            case 4:
                dia="Jueves";
                break;
            case 5:
                dia="Viernes";
                break;
            case 6:
                dia="Sabado";
                break;
            case 7:
                dia="Domingo";
                break;
            default:
                dia="Dia incorrecto";

        }
        System.out.println(dia);
        }
    }


package intro;
import java.util.Scanner;

public class estructuraIF {
    public static void main(String [] args){
        Scanner scanner =new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad=scanner.nextInt();

        if(edad >=21){
            System.out.println("Usted es mayor");
        }else{
            System.out.println("Usted es menor");
        }
    }
}

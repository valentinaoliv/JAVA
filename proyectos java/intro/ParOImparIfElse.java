package intro;
import java.util.Scanner;

public class ParOImparIfElse {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
         System.out.print("ingres un numero: ");
         int num = scanner.nextInt();

         String msg =(num %2 ==0) ? "ES PAR ": "ES IMPAR";

         System.out.println("el numero "+num+ " es " +msg);
         /*if (num % 2==0){
             System.out.println("El numero es par");
        }else{
             System.out.println("El numero es impar");
         }*/
    }
}

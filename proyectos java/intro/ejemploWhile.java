package intro;
import java.util.Scanner;

public class ejemploWhile {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int i= 1;

        while( i <= n){

            System.out.println(i);

            i++;
        }

    }
}

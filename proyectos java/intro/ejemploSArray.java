package intro;
import java.sql.Array;
import java.util.Scanner;

public class ejemploSArray {
    public static void main(String[] args) {

        int arr[] = new int[10];

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un valor: ");
        int num = scanner.nextInt();

        int i=0;

        while(num !=0 && i<10){

            arr[i++]=num;
            System.out.print("Ingrese el siguiente valor: ");
            num=scanner.nextInt();
        }

        for (int j = 0; j < 10; j++) {
            System.out.println(arr[j]);
        }

    }
}

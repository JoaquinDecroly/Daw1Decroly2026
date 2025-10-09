import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ejercicio 1
        Scanner sc1 = new Scanner(System.in);

        int[] nums1 = new int[10];
        
        System.out.println("Inserte 10 numeros");

        int i;
        for (i = 0; i < nums1.length; i++) {
            System.out.println("Numero " + i + "/10");
            nums1[i] = sc1.nextInt();
        }


        System.out.println("\n Los numeros insertados son: \n");
        for(int num : nums1){
            System.out.println(num);
        }


    }
}
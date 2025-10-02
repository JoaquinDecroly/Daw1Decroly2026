import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //ejercicio 1
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Edad: ");
        int edad1 = sc1.nextInt();

        if (edad1 > 17) {
            System.out.println("Eres mayor de edad!");
        }


        //ejercicio 2
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Edad: ");
        int edad2 = sc1.nextInt();

        if (edad2 > 17) {
            System.out.println("Eres mayor de edad!");
        }else System.out.println("Eres menor de edad!");


        //ejercicio 3
        
    }
}
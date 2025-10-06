import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ejercicio 1
        Scanner sc1 = new Scanner(System.in);


        int cantidad;
        do {
            System.out.println("Introduzca la cantidad de billetes para ver el cambio: ");
            cantidad = sc1.nextInt();

        } while ((cantidad %= 5) != 0);


        cantidad = cantidad %= 500;
        int billetes500 = cantidad / 500;


        //ejercicio 2
        Scanner sc2 = new Scanner(System.in);

        String option = "";

        do {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            option = sc2.nextLine();

            switch (option) {
                case "1":
                    System.out.println("Numero 1: ");
                    double num1 = sc2.nextDouble();
                    System.out.println("Numero 2: ");
                    double num2 = sc2.nextDouble();
                    double suma = num1 + num2;
                    System.out.println("La suma es: " + suma);
                    break;
                case "2":
                    System.out.println("Numero 1: ");
                    double num21 = sc2.nextDouble();
                    System.out.println("Numero 2: ");
                    double num22 = sc2.nextDouble();

                    double resta = num21 + num22;
                    System.out.println("La resta es: " + resta);
                    break;
                case "3":
                    System.out.println("Numero 1: ");
                    double num31 = sc2.nextDouble();
                    System.out.println("Numero 2: ");
                    double num32 = sc2.nextDouble();

                    double producto = num31 * num32;
                    System.out.println("El producto es: " + producto);
                    break;
                case "4":
                    System.out.println("Numero 1: ");
                    double num41 = sc2.nextDouble();
                    System.out.println("Numero 2: ");
                    double num42 = sc2.nextDouble();

                    double division = num41 + num42;
                    if (num42 == 0) {
                        System.out.println("La division con determinador 0, es indeterminado");
                    } else {
                        System.out.println("La division es: " + division);
                    }

                    break;
                case "5":
                    break;
                default:
                    System.out.println("Escoja una opcion correcta");
                    break;
            }

        } while (!option.equals("5"));
    }
}
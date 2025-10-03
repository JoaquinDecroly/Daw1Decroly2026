import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //ejercicio 1
//        Scanner sc1 = new Scanner(System.in);
//
//        System.out.println("Edad: ");
//        int edad1 = sc1.nextInt();
//
//        if (edad1 > 17) {
//            System.out.println("Eres mayor de edad!");
//        }
//
//
//        //ejercicio 2
//        Scanner sc2 = new Scanner(System.in);
//        System.out.println("Edad: ");
//        int edad2 = sc1.nextInt();
//
//        if (edad2 > 17) {
//            System.out.println("Eres mayor de edad!");
//        }else System.out.println("Eres menor de edad!");
//
//
//        //ejercicio 3
//        for(int i = 0; i < 21; i++){
//            System.out.println("El valor de i es: " + i);
//        }

        //ejercicio 4
//        for(int j = 0; j <= 200; j++){
//            //bucle para sumar de 1 en 1, hasta 200
//            //a la hora de imprimir suma 1 más
//        System.out.println("Los valores pares de j, sumando de 2 en 2, son: " + j++);
//        }
//
//        //ejercicio 5
//        for(int z = 0; z <= 200; z++){
//            int cont = 2; //contador con valor 2
//
//            if(z % cont == 0){ //resto de z / cont (2), si es igual a 0, se imprime
//                System.out.println("Los valores pares de j, sumando de 1 en 1, son: " + z);
//            }
//        }

        //ejercicio 6
//        Scanner sc = new Scanner (System.in);
//
//        System.out.println("Introduce N: ");
//        double N = sc.nextDouble();
//
//        for(int i = 0;i <= N; i++){
//            System.out.println(" Los numeros hasta N son: " + i);
//        }

        //ejercicio 7

//        Scanner sc1 = new Scanner(System.in);
//
//        int nota;
//        do {
//            System.out.println("Inserte la nota a calificar: ");
//            nota = sc1.nextInt();
//                if(nota <= 0 || nota >10){
//                    System.out.println("Escribe una nota entre 0-10");
//                }
//        } while (nota <= 0 || nota > 10);
//
//        switch (nota) {
//            case 1:
//                System.out.println("SUSPENSO");
//                break;
//            case 2:
//                System.out.println("SUSPENSO");
//                break;
//            case 3:
//                System.out.println("SUSPENSO");
//                break;
//            case 4:
//                System.out.println("SUSPENSO");
//                break;
//            case 5:
//                System.out.println("SUFICIENTE");
//                break;
//            case 6:
//                System.out.println("SUFICIENTE");
//                break;
//            case 7:
//                System.out.println("NOTABLE");
//                break;
//            case 8:
//                System.out.println("NOTABLE");
//                break;
//            case 9:
//                System.out.println("SOBRESALIENTE");
//                break;
//            case 10:
//                System.out.println("SOBRESALIENTE");
//                break;
//            default:
//                System.out.println("Escribe una nota entre 0-10");
//        }

        //ejercicio 8
        Scanner sc2 = new Scanner(System.in);
        long n;

            System.out.println("Valor de N, para calcular factorial: ");
            n = sc2.nextLong();

        if(n > 0){
            for(long i = n; i <= 1; i++){
                System.out.println(i);

                long exp = n;
                long factorial = (exp *= i);
            }

        }else{
            System.out.println("N debe ser un numero entero positivo distinto de 0");
        }

//        System.out.println("Valor de N, para calcular factorial: ");
//        n = sc2.nextInt();
//
//        if(n > 0){
//            for(int i = 1; i <= n; i++){
//                int factorial = n * (n-i);
//                System.out.println("El factorial de N es: " + factorial);
//            }
//        }else{
//            System.out.println("N debe ser un numero entero positivo distinto de 0");
//        }

    } //main
} //class
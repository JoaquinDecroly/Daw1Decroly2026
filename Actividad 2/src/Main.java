import java.util.Scanner;
//import java.time.temporal;

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
//        Scanner sc2 = new Scanner(System.in);
//        long n;
//
//            System.out.println("Valor de N, para calcular factorial: ");
//            n = sc2.nextLong();

//        long factorial = 1;
//
//        if(n > 0){
//            for(long i = n; i >= 0; i++){
//              factorial += i;
//            }
//           System.out.println("N!: " + i);
//        }else{
//            System.out.println("N debe ser un numero entero positivo distinto de 0");
//        }


        //ejercicio 9
        Scanner sc3 = new Scanner(System.in);
        
        int hora = 0;
        int min = 0;
        int seg = 0;

        boolean hora1 = false;
        boolean min1 = false;
        boolean seg1 = false;
        do {
            System.out.println("Escriba una hora (24h max): ");// 23 horas, 59 minutos, 59 segundos = 00:00:00
            hora = sc3.nextInt();
            
            if (hora >= 0 && hora <= 23) {
                hora1 = true;
                
                System.out.println("Escriba un minuto (0-59): "); //59 minutos y 59 seg = 1 hora mas
                min = sc3.nextInt();
                
                if (min >= 0 && min <= 59) {
                    min1 = true;
                    
                    System.out.println("Escriba un segundo (0-59): ");//59 segundos = 1 minuto mas
                    seg = sc3.nextInt();

                    if(seg >= 0 && seg <= 59){
                        seg1 = true;
                    }else{
                        seg1 = false;
                    }
                }else{
                    min1 = false;
                }
            }else{
                hora1 = false;
            }
        } while (!hora1 || !min1 || !seg1);

        seg++;//sumar 1 segundo

        if (hora == 23 && min == 59 && seg == 59) { //si 
            hora = 0;
            min = 0;
            seg = 0;
            System.exit(0);
        }else if(min == 59){//si minuto = 59, volver a 0 y sumar 1 a hora
            min = 0;
            hora++;
        }else if(seg == 59){ //si segundos = 60, volver a 0 y sumar 1 a minuto
            seg = 0;
            min++;
        }
        
        System.out.println(hora + ":" + min + ":" + seg); // mostrar hora formateada


    } //main
} //class
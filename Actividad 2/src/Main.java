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


//        //ejercicio 9
//        Scanner sc3 = new Scanner(System.in);
//        
//        int hora = 0;
//        int min = 0;
//        int seg = 0;
//
//        boolean hora1 = false;
//        boolean min1 = false;
//        boolean seg1 = false;
//        do {
//            System.out.println("Escriba una hora (24h max): ");// 23 horas, 59 minutos, 59 segundos = 00:00:00
//            hora = sc3.nextInt();
//            
//            if (hora >= 0 && hora <= 23) {
//                hora1 = true;
//                
//                System.out.println("Escriba un minuto (0-59): "); //59 minutos y 59 seg = 1 hora mas
//                min = sc3.nextInt();
//                
//                if (min >= 0 && min <= 59) {
//                    min1 = true;
//                    
//                    System.out.println("Escriba un segundo (0-59): ");//59 segundos = 1 minuto mas
//                    seg = sc3.nextInt();
//
//                    if(seg >= 0 && seg <= 59){
//                        seg1 = true;
//                    }else{
//                        seg1 = false;
//                    }
//                }else{
//                    min1 = false;
//                }
//            }else{
//                hora1 = false;
//            }
//        } while (!hora1 || !min1 || !seg1);
//
//        seg++;//sumar 1 segundo
//
//        if (hora == 24) { //si 
//            hora = 0;
//            min = 0;
//            seg = 0;
//        }else if(min == 60){//si minuto = 60, volver a 0 y sumar 1 a hora
//            min = 0;
//            hora++;
//        }else if(seg == 60){ //si segundo = 60, volver a 0 y sumar 1 a minuto
//            seg = 0;
//            min++;
//        }
//        
//        System.out.printf("%02d:%02d:%02d", hora, min, seg); // mostrar hora formateada con 2 digitos(%02d) + ":"
//
//        //ejercicio 10
//        Scanner sc4 = new Scanner(System.in);
//        int[] nums = new int[10];
//        
//        boolean hayNegativo = false;
//        
//        for(int i = 0; i < nums.length; i++){ //bucle leer numero con longitud array nums(10)
//            System.out.println("Inserte 10 numeros: ");
//                nums[i] = sc4.nextInt();
//        }
//        
//        for(int num : nums){//recorrer array
//            if(num < 0){
//                hayNegativo = true;
//                break;
//            }
//        }
//        
//        if(hayNegativo){
//            System.out.println("Hay al menos un numero negativo");
//        }else{
//            System.out.println("No hay numeros negativos");
//        }
        
//        //ejercicio 11
//        Scanner sc5 = new Scanner(System.in);
//        int[] nums1 = new int[10];
//
//        int contP = 0;
//        int contN = 0;
//
//        for(int i = 0; i < nums1.length; i++){ //bucle leer numero con longitud array nums(10)
//            System.out.println("Inserte 10 numeros: ");
//            nums1[i] = sc5.nextInt();
//        }
//
//        for(int num : nums1){//recorrer array
//            if(num < 0){
//                contN++;
//            }else if(num > (-1)){
//                contP++;
//            }
//        }
//        System.out.println("Hay un total de " + contP + " numeros positivos");
//        System.out.println("Hay un total de " + contN + " numeros negativos");

        //ejercicio 12
        Scanner sc6 = new Scanner(System.in);
        int[] nums2 = new int[50];
        
        

        boolean hayNegativo1 = false;
        int contP1 = 0;//contador numeros positivos
        int contN1 = 0;//contador numeros negativos

        int cont = 0; //contador total numeros
        
        do {
            System.out.println("Inserte numeros(0 para finalizar): ");
            int numero = sc6.nextInt();

            if (numero != 0) {
                nums2[cont] = numero;
                cont++;
            } else {
                break; // Salir del bucle cuando se introduce 0
            }

        } while (cont < 50);
        
        

        for(int i = 0;i < cont; i++){//recorrer array
           if(nums2[i] < 0){
                hayNegativo1 = true;
                contN1++;
            }else if(nums2[i] > 0){
                contP1++;
            }
        }

        System.out.println("El array tiene un total de: " + cont + " numeros");

        if(hayNegativo1){
            System.out.println("Hay al menos un numero negativo");
        }else{
            System.out.println("No hay numeros negativos");
        }
        
        System.out.println("Hay un total de " + contP1 + " numeros positivos (el 0 no es contado)");
        System.out.println("Hay un total de " + contN1 + " numeros negativos");
        
        
        
    } //main
} //class
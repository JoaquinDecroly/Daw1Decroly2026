import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ejercicio 1
        Scanner sc = new Scanner(System.in);
//        int[] array = new int[10];
//        
//        for(int i = 0; i < array.length; i++){
//            System.out.println("Numero " + (i + 1));
//            array[i] = sc.nextInt();
//        }
//        
//        for(int nums : array){
//            System.out.print(nums + " " );
//        }

        //ejercicio 2
//        sc = new Scanner(System.in);
//        int[] array = new int[10];
//        
//        int suma = 0;
//
//        for(int i = 0; i < array.length; i++){
//            System.out.println("Numero " + (i + 1));
//            array[i] = sc.nextInt();
//            suma += array[i];
//        }
//        System.out.println(suma);

        // ejercicio 3
//        sc = new Scanner(System.in);
//        int[] array = new int[10];
//
//        for(int i = 0; i < array.length; i++){
//            System.out.println("Numero " + (i + 1));
//            array[i] = sc.nextInt();
//        }
//        
//        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
//        
//        for(int i = 0; i < array.length; i++){
//            max = Math.max(array[i], max);
//            min = Math.min(array[i], min);
//        }
//        
//        System.out.println("Maximo: " + max + ", y minimo: " + min);

        //ejercicio 4
//        sc = new Scanner(System.in);
//        int[] array = new int[20];
//
//        int sumaP = 0, sumaN = 0;
//
//        for(int i = 0; i < array.length; i++){
//            System.out.println("Numero " + (i + 1));
//            array[i] = sc.nextInt();
//            
//            if(array[i] > 0){
//                sumaP += array[i];
//            }else{
//                sumaN += array[i];
//            }
//        }
//        System.out.println("Suma\nPositivos: " + sumaP + "\nNegativos: " + Math.abs(sumaN));

        //EJERCICIO 5
//        sc = new Scanner(System.in);
//
//        int[] array = new int[20];
//        int suma = 0;
//        
//        for(int i = 0; i < array.length; i++){
//            System.out.println("Numero " + (i + 1));
//            array[i] = sc.nextInt();
//
//            suma += array[i];
//        }
//        System.out.println("La media es: " + (suma/ array.length));
        
        
        //ejercicio 6
//        sc = new Scanner(System.in);
//
//
//       System.out.println("Tamano array: ");
//       int N = sc.nextInt();
//
//        double[] array = new double[N];
//
//        System.out.println("Valor a mostrar: ");
//        double M = sc.nextDouble();
//
//        Arrays.fill(array, M);
//
//        for(double nums : array){
//            System.out.println(nums);
//        }

        //ejercicio 7
//        sc = new Scanner(System.in);
//
//           System.out.println("P: ");
//           int P = sc.nextInt();
//    
//            System.out.println("Q: ");
//            int Q = sc.nextInt();
//            
//            int dimension = Q - P + 1;
//            
//            int[] array = new int[dimension];
//            
//            for(int i = 0; i < array.length;i++){
//                array[i] = (P + i);
//            }
//            
//            System.out.println(Arrays.toString(array));

        //ejercicio 8
//        sc = new Scanner(System.in);
//        
//        double[] array = new double[100];
//        int contM = 0;
//        int contI = 0;
//        
//        System.out.print("Numero a comprobar: ");
//        double R = sc.nextDouble();
//        
//        for(int i = 0; i < array.length;i++){
//            array[i] = Math.random();
//            
//            if(array[i] > R ){
//                contM++; 
//            }else if(array[i] == R){
//                contI++;
//            }
//        }
//        System.out.println("Hay " + contI + " numeros iguales\ny " +  contM +" superiores a " + R);
//
//       for(int i = 0; i < array.length;i++){
//           System.out.print(array[i] + " ");
//           if((i % 5) == 0){
//               System.out.println();
//           }
//       }

        //ejercicio 9
//        sc = new Scanner(System.in);
//
//        int[] array = new int[100];
//       
//
//        System.out.print("Numero a comprobar: ");
//        int N = sc.nextInt();
//        
//        int i;
//        for(i = 0; i < array.length;i++){
//            array[i] = (int)(1 + Math.random() * 10);
//        }
//        System.out.println("El numero " + N + " aparece en las posiciones: ");
//
//        for(i = 0; i < array.length;i++){
//            if((array[i]) == N){
//                System.out.print(i + ", ");
//            }
//        }

        //ejercicio 10
//        sc = new Scanner(System.in);
//        double[] array = new double[50];
//
//        double tecla;
//        int cont = 0;
//
//        // Leer alturas hasta introducir 0
//        do {
//            System.out.print("Introduzca altura (0 para terminar): ");
//            tecla = sc.nextDouble();
//
//            if (tecla != 0.0) {
//                array[cont] = tecla;
//                cont++;
//            }
//
//        } while (tecla != 0.0);
//
//        if (cont == 0) {
//            System.out.println("No se introdujeron alturas.");
//            return;
//        }
//
//        // Cálculo de máximo, mínimo y media
//        double max = Double.MIN_VALUE;
//        double min = Double.MAX_VALUE;
//        double suma = 0.0;
//        
//        for (int i = 1; i < cont; i++) {
//            suma += array[i];
//            max = Math.max(array[i], max);
//            min = Math.min(array[i], min);
//        }
//
//        System.out.println("Máximo: " + max + " m");
//        System.out.println("Mínimo: " + min + " m");
//        System.out.println("Media: " + (suma / cont) + " m");

        //ejercicio 11
//        int[] array = new int[100];
//        int[] arrayInverso = new int[100];
//        
//        for(int i = 0; i < array.length;i++){
//            array[i] = i + 1;
//        }
//        
//        for(int i = 0; i < array.length;i++){
//            arrayInverso[i] = array[array.length -1 -i];
//        }
//        
//        System.out.println(Arrays.toString(array));
//        System.out.print(Arrays.toString(arrayInverso));

        //ejercicio 12
//        sc = new Scanner(System.in);
//        
//        int[] array = new int[10];
//        
//        String opcion = "c";
//        do{
//            System.out.println("\na. Mostrar valores.\n" +
//                    "b. Introducir valor.\n" +
//                    "c. Salir."); 
//                    opcion = sc.nextLine();
//                    
//                    switch (opcion){
//                        case "a":
//                            for(int nums : array){
//                                System.out.print(nums + " ");
//                            }
//                        break;
//                        
//                        case "b":
//                            System.out.println("Valor V: ");
//                            int V = sc.nextInt();
//                            
//                            System.out.println("Valor V=" + V +", a insertar en Posicion (0-9): ");
//                            int P = sc.nextInt();
//
//                            if (P >= 0 && P < array.length) {
//                                array[P-1] = V;
//                                System.out.println("Valor insertado correctamente.");
//                            } else {
//                                System.out.println("Posición fuera de rango (0–9).");
//                            }
//                        break;
//                        
//                        case "c":
//                            System.out.println("Saliendo...");
//                        break;
//                        
//                        default:
//                            System.err.println("Opcion incorrecta. Escoja a, b o c, no es tan difícil");
//                    }
//        }while(!opcion.equals("c"));

        //ejercicio 13
//        sc = new Scanner(System.in);
//        System.out.println("V");
//        int V = sc.nextInt();
//        
//        System.out.println("I");
//        int I = sc.nextInt();
//        
//        System.out.println("N");
//        int N = sc.nextInt();
//
//        int[] array = new int[N];
//        
//        array[0] = V;
//        
//        for(int i = 0; i < array.length;i++){
//            array[i] = (i - 1) + I;
//           
//        }
//        System.out.println(Arrays.toString(array));

        //ejercicio 14
        int[] array = new int[55];
        int pos = 0;

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                array[pos] = i;
                pos++;
            }
        }

        System.out.println(Arrays.toString(array));

        
    }
}
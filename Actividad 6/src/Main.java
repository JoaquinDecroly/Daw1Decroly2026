import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ejercicio 1
//        int[][] matriz = new int[5][5];
//
//
//        for(int i = 0; i < 5;i++){
//        for(int j = 0;j < 5;j++){
//            matriz[i][j] =  (i * 5) + j + 1;
//        }
//        }
//
//        for(int i = 0; i < 5;i++){
//            for(int j = 0;j < 5;j++){
//                System.out.print(matriz[i][j] + " ");
//                if((matriz[i][j] % 5)==0){
//                    System.out.println();
//                }
//            }
//        }

        //ejercicio 2 (CORREGIR)
//        int[][] matriz2 = new int[10][10];
//
//        for(int i = 0;i < matriz2.length;i++){
//            for(int j = 0;i < matriz2[i].length;j++){
//                matriz2[i][j] = (i * 10) + j + 1;
//            }
//        }
//        for(int i = 0;i < matriz2.length;i++){
//            for(int j = 1;i < matriz2[i].length;j++){
//                System.out.print(matriz2[i][j]);
//
//            }
//        }

        //ejercicio 3
//        Scanner sc = new Scanner(System.in);
//
//        int menores = 0;
//        int mayores = 0;
//        int ceros = 0;
//
//
//        System.out.println("Filas N ");
//        int N = sc.nextInt();
//        System.out.println("Columnas M ");
//        int M = sc.nextInt();
//
//            int[][] matriz3 = new int[N][M];
//
//            for(int i = 0;i < matriz3.length;i++){
//                for(int j = 0;j < matriz3[i].length;j++){
//                    System.out.println("Valor [" + i +"][" + j + "]");
//                    matriz3[i][j] = sc.nextInt();
//                }
//            }
//
//
//        for(int i = 0;i < matriz3.length;i++){
//            for(int j = 0;j < matriz3[i].length;j++){
//                if(matriz3[i][j] < 0){
//                    menores++;
//                }
//                if(matriz3[i][j] > 0){
//                    mayores++;
//                }
//                if(matriz3[i][j] == 0){
//                    ceros++;
//                }
//                System.out.print(matriz3[i][j]);
//            }
//        }
//
//        System.out.println("Hay " + mayores + " numeros mayores a 0");
//        System.out.println("Hay " + menores + " numeros menores a 0");
//        System.out.println("Hay " + ceros + " numeros iguales a 0");

        //ejercicio 4
        Scanner sc1 = new Scanner(System.in);
        int[][] array = new int[4][5];

        for(int i = 0; i < array.length; i++){
            System.out.println("Ponga notas alumno " + (i + 1));
            for(int j = 0; j < array[i].length; j++){
                System.out.println("Posicion [" + i + "][" + j + "]");
                System.out.print("Nota " + (j + 1) + ": ");
                array[i][j] = sc1.nextInt();
            }
        }
        for(int i = 0; i < array.length; i++){
            
            int max = Arrays.stream(array[i]).max().getAsInt();//formula sacar max
            int min = Arrays.stream(array[i]).min().getAsInt();//formula sacar min
            double media = Arrays.stream(array[i]).average().getAsDouble();//formula sacar media
            
            System.out.println("Alumno " + (i + 1));
            System.out.println("La nota maxima es: " + max);
            System.out.println("La nota minima es: " + min);
            System.out.println("La nota media es: " + media);
            System.out.println("---------------------------------");
        }
    }
}
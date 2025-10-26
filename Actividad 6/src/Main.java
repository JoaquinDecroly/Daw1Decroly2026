import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ejercicio 1
//        int[][] matriz = new int[5][5];
//
//
//        for(int i = 0; i < 5;i++){
//          for(int j = 0;j < 5;j++){
//            matriz[i][j] =  (i * 5) + j + 1; //multiplicar fila * 5 + la columna + 1
//          }
//        }
//
//        for(int i = 0; i < 5;i++){
//            for(int j = 0;j < 5;j++){
//                System.out.print(matriz[i][j] + " ");
//                  if((matriz[i][j] % 5)==0){
//                    System.out.println();
//                  }
//            }
//        }

        //ejercicio 2 
//        int[][] matriz2 = new int[10][10];
//
//        for(int i = 1;i <= matriz2.length;i++){//empezando en i =1; <= length
//            for(int j = 1; j <= matriz2[i].length;j++){//empezando en i =1; <= length
//                matriz2[i][j] = i * j; //multiplicar fila * columna --> 1*1, 1*2..*3...*4
//            }
//        }
//        for(int i = 1;i <= matriz2.length;i++){//empezando en i =1; <= length
//            for(int j = 1;j <= matriz2[i].length;j++){//empezando en i =1; <= length
//                System.out.print(matriz2[i][j + " "]);//imprimir 1-10
//            }
//                System.out.println();
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
        
//                if(matriz3[i][j] < 0){ //mayor, menor o igual a 0 + contadores
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
               
                System.out.println("Posicion [" + i + "][" + j + "]"); //posicion matriz

                System.out.print("Nota " + (j + 1) + ": "); //dar nota cambio columna
                array[i][j] = sc1.nextInt();
            }
        }
        for(int i = 0; i < array.length; i++){
            
            int suma = 0;
            int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
                
                for(int j = 0;j < array[i].length;j++){
                  int nota = array[i][j];
                  
                  max = Math.max(nota, max);
                  min = Math.min(nota, min);
                  
                  suma += nota;
                }

            System.out.println("\nAlumno " + (i + 1));
            System.out.println("La nota maxima es: " + max);
            System.out.println("La nota minima es: " + min);
            System.out.println("La nota media es: " + ((double)suma/array[i].length));
            System.out.println("---------------------------------");
            
        }

        //ejercicio 5
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println(" N Personas: ");
//        int N = sc.nextInt();
//
//        double[][] array2 = new double[N][2]; //lineas N, columnas fijas
//
//        double sueldo = 0.0;
//        int genero = 0;
//
//        double sumaMasc = 0.0;
//        double sumaFem = 0.0;
//
//        int masc = 0;
//
//        int fem = 0;
//        
//
//        for (int i = 0; i < array2.length; i++) {
//            System.out.println("Persona " + (i + 1));
//
//            System.out.println("Género (0 para varón, 1 para mujer): ");//pedir genero y almacenarlo columna 0 cualquier linea
//            array2[i][0] = sc.nextInt();
//            
//            System.out.println("Sueldo: "); //pedir sueldo y almacenarlo columna 1 cualquier linea
//            array2[i][1] = sc.nextDouble();
//            
//        }
//
//        System.out.println("\n--- Datos Registrados ---");
//            for (int i = 0; i < array2.length; i++) {
//                System.out.println("Persona " + (i + 1) + "--------"); //persona
//                System.out.print("Genero " + array2[i][0] + " " + "Sueldo " + array2[i][1] + "\n");
//                
//
//                sueldo = array2[i][1];
//                genero = (int) array2[i][0];
//
//                if(genero == 0){
//                    masc++;
//                    sumaMasc+=sueldo;
//                    
//                }else{
//                    fem++;
//                    sumaFem+=sueldo;
//                }
//                
//            }
//        System.out.println("Media sueldo: " + "\nVarones " + sumaMasc/masc + "\nMujeres " + sumaFem/fem);
    }
}
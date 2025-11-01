import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //ejercicio 1
//        int[][] matriz = new int[5][5];
//        
//        for(int i = 0;i < matriz.length;i++){
//            for(int j = 0;j < matriz[i].length;j++){
//                matriz[i][j] = (i * 5) + j + 1;
//            }
//        }
//
//        for(int i = 0;i < matriz.length;i++){
//            for(int j = 0;j < matriz[i].length;j++){
//                System.out.print(matriz[i][j]);
//            }
//        }

            //ejercicio 2
//        int[][] matriz = new int[10][10];
//
//        for(int i = 0;i < matriz.length;i++){
//            for(int j = 0;j < matriz[i].length;j++){
//                matriz[i][j] = (i + 1) * (j + 1);
//            }
//        }
//        for(int i = 0;i < matriz.length;i++){
//            for(int j = 0;j < matriz[i].length;j++){
//                System.out.printf("%4d", matriz[i][j]);
//                if(j == matriz[i].length - 1){
//                    System.out.println();
//                }
//            }
//        }

        //ejercicio 3
//        sc = new Scanner(System.in);
//        
//        int contMayor = 0;
//        int contMenor = 0;
//        int contIgual = 0;
//        
//        System.out.println("Valor N (filas): ");
//        int N = sc.nextInt();
//        
//        System.out.println("Valor M (columnas): ");
//        int M = sc.nextInt();
//        
//        int[][] matriz = new int[N][M];
//
//        for(int i = 0;i < matriz.length;i++){
//            System.out.println("Fila(" + (i + 1) + ")");
//            for(int j = 0;j < matriz[i].length;j++){
//                System.out.println("Columna [" + j +"]");
//                matriz[i][j] = sc.nextInt();
//                
//                if(matriz[i][j] > 0){
//                    contMayor++;
//                }else if(matriz[i][j] < 0){
//                    contMenor++;
//                }else{
//                    contIgual++;
//                }
//            }
//        }
//        
//        System.out.println("Mayor a 0: " + contMayor);
//        System.out.println("Menor a 0: " + contMenor);
//        System.out.println("Igual a 0: " + contIgual);

        //ejercicio 4
//        sc = new Scanner(System.in);
//        
//        int[][] matriz = new int[4][5];
//
//        for(int i = 0;i < matriz.length;i++){
//            System.out.println("Alumno " + (i + 1));
//            
//            int suma = 0;
//            int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
//            
//            for(int j = 0;j < matriz[i].length;j++){
//                System.out.println("Asignatura " + (j + 1));
//                matriz[i][j] = sc.nextInt();
//
//               suma += matriz[i][j];
//               max = Math.max(matriz[i][j], max);
//               min = Math.min(matriz[i][j], min);
//            }
//            System.out.println("\nAlumno " + (i + 1));
//            System.out.println("La nota maxima es: " + max);
//            System.out.println("La nota minima es: " + min);
//            System.out.println("La nota media es: " + (double)(suma/matriz[i].length));
//            System.out.println("---------------------------------");
//        }

        //ejercicio 5
//        sc = new Scanner(System.in);
//        
//        double sumaMujer = 0;
//        double sumaHombre = 0;
//        
//        int contH = 0;
//        int contM = 0;
//        
//        System.out.println("Personas totales a registrar: ");
//        int pers = sc.nextInt();
//
//                double[][] matriz = new double[pers][2];
//
//        for(int i = 0;i < matriz.length;i++){
//            System.out.println("Persona " + (i + 1));
//
//            for(int j = 0;j < matriz[i].length;j++){
//                System.out.println("Genero (0-1) ");
//                matriz[i][0] = sc.nextInt();
//                System.out.println("Sueldo ");
//                matriz[i][1] = sc.nextDouble();
//
//                if(matriz[i][0] == 1){
//                    sumaMujer += matriz[i][1];
//                    contM++;
//                }else{
//                    sumaHombre += matriz[i][1];
//                    contH++;
//                }
//                
//            }
//            
//        }
//        System.out.println("El sueldo medio de las mujeres es:\n" + (sumaMujer/contM));
//        System.out.println("---------------------------------");
//        System.out.println("El sueldo medio de los hombres es:\n" + (sumaHombre/contH));





    }
}
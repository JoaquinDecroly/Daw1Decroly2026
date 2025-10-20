import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        //ejercicio 1
//        Scanner sc1 = new Scanner(System.in);
//
//        int[] nums1 = new int[10];
//        
//        System.out.println("Inserte 10 numeros");
//
//        int i;
//        for (i = 0; i < nums1.length; i++) {
//            System.out.println("Numero " + i + "/9");
//            nums1[i] = sc1.nextInt();
//        }
//
//
//        System.out.println("\n Los numeros insertados son: \n");
//        for(int num : nums1){ //for-each == for pero con dos variables
//            System.out.println(num);
//        }


//        //ejercicio 2
//        Scanner sc2 = new Scanner(System.in);
//
//        int[] nums2 = new int[10];
//        int suma = 0;
//        
//        System.out.println("Inserte 10 numeros");
//
//        int i;
//        for (i = 0; i < nums2.length; i++) {
//            System.out.println("Numero " + i + "/9");
//            nums2[i] = sc2.nextInt();
//            
//            suma += nums2[i]; //sumar resultados pedidos
//        }
//        System.out.println(i);

//        //ejercicio 3
//        Scanner sc3 = new Scanner(System.in);
//
//        double[] nums1 = new double[10];
//
//        System.out.println("Inserte 10 numeros");
//
//        int i;
//        for (i = 0; i < nums1.length; i++) {
//            System.out.println("Numero " + i + "/9");
//            nums1[i] = sc3.nextInt();
//        }
//
//        double max = Double.MIN_VALUE, min = Double.MAX_VALUE;
//
//        Math.max(nums1[i], max);
//        Math.min(nums1[i], min);
//
//        System.out.print("Maximo: " + max + "\n Minimo: " + min);

//        //ejercicio 4
//        Scanner sc4 = new Scanner(System.in);
//
//        int[] nums3 = new int[20];
//        int sumaP = 0;
//        int sumaN = 0;
//        
//        
//        System.out.println("Inserte 10 numeros");
//
//        int i;
//        for (i = 0; i < nums3.length; i++) {
//            System.out.println("Numero " + i + "/19");
//            nums3[i] = sc4.nextInt();
//            
//            if(nums3[i] > -1){ //contadores para sumar
//                sumaP += nums3[i];
//            }else{
//                sumaN += nums3[i];
//            }
//        }
//        System.out.prin("Suma Numeros \n\t Positivos " + sumaP + "\n\t Negativos " + sumaN);

//        //ejercicio 5
//        Scanner sc5 = new Scanner(System.in);
//
//        double[] nums2 = new double[20];
//        double suma = 0;
//
//
//        System.out.println("Inserte 10 numeros");
//
//        int i;
//        for (i = 0; i < nums2.length; i++) {
//            System.out.println("Numero " + i + "/19");
//            nums2[i] = sc5.nextInt();
//
//            suma += nums2[i]; //sumar numeros insertados
//            double media = suma / nums2.length; //hacer media suma / longitud array
//        }
//      
//        System.out.println("Media: " + media);

//        //ejercicio 6
//        Scanner sc6 = new Scanner(System.in);
//        
//        System.out.println("Ingrese valor N (tamano array) ");
//        int N = sc6.nextInt();
//            int[] array = new int[N]; //array tamano N
        
//        System.out.println("Ingrese valor M ");
//          int M = sc6.nextInt();
//            Arrays.fill(array, M); //llenar todo el array con valor M
//            
//            for(int num : array){
//                System.out.print("\n" + num);
//            }

//        //ejercicio 7
//        Scanner sc7 = new Scanner(System.in);
//        System.out.println("P ");
//        int P = sc7.nextInt();
//
//        System.out.println("Q ");
//        int Q = sc7.nextInt();
//
//        int dimesion = (Q-P) -1;
//
//        int[] array1 = new int[dimesion]; //array con valores predefinidos {...,...}
//
//        for(int i = 0; i < array1.length; i++){
//            array1[i] = P + (i + 1);
//        }
//        System.out.println(Arrays.toString(array1));

//        //ejercicio 8
//        Scanner sc8 = new Scanner(System.in);
//        double[] array2 = new double[100];
//
//        System.out.println("Valor R: ");
//        double R = sc8.nextDouble();
//
//        for(int i = 0;i < array2.length;i++){
//            array2[i] = Math.random(); //math.random() = generador aleatorio nums 0-1
//
//            if(array2[i] >= R){
//                System.out.println(array2[i] + " es superior a " + R);
//            }
//        }

//        //ejercicio 9
//        Scanner sc9 = new Scanner(System.in);
//        int[] array3 = new int[100];
//        
//        System.out.println("Introduce N ");
//        int N = sc9.nextInt();
//        for(int i = 0;i < array3.length;i++){
//            array3[i] = (int)(1 + Math.random() * 10); //generar nums + 1 (empieza por 1) * 10 --> 1-10
//            
//            if(array3[i] == N){
//                System.out.println(i);
//            }
//        }

//        //ejercicio 10
        Scanner sc10 = new Scanner(System.in);


        System.out.println("Introduzca N ");
        double N = sc10.nextDouble();



        double suma = 0;

        double[] altura = new double[(int)N];

        for(int i = 0; i < altura.length;i++){
            System.out.println("Inserte la altura " + (i + 1) + ":");
            altura[i] = sc10.nextDouble();
        }


        double media = 0;
        double max = 0;
        double min = 0;

        for (int i = 0; i < altura.length; i++) {
            altura[i] += suma;
            media = suma / altura.length;

         max = Double.MIN_VALUE;
         min = Double.MAX_VALUE;

        Math.max(altura[i], max);
        Math.min(altura[i], min);

            if(altura[i] >= media){
                System.out.println("Mayor o igual a la media " + altura[i]);
            }else{
                System.out.println("Menor o igual a la media " + altura[i]);
            }
        }

        System.out.println("Media " + media);
        System.out.println("Maximo " + max);
        System.out.println("Minimo " + min);

//        //ejercicio 11 
//        Scanner sc11 = new Scanner(System.in);
//        int[] array5 = new int[100];
//        int[] array6 = new int[100];
//
//        for(int i = 0;i < array5.length;i++){
//            array5[i] = i + 1; //sumar 1 --> 1,2,3,4,5,...
//        }
//
//        for (int i = 0; i < array5.length; i++) {
//            array6[i] = array5[array5.length - 1 - i]; //copia inversa
//        }
//
//       for(int num : array5){
//            System.out.print(num + " ");
        
//            if((num % 30) == 0){
//                System.out.println("\n");
//            }else if(num == 100){
//                System.out.println("\n");
//            }
//        }
//
//        for(int num : array6){
//            System.out.print(num + " ");
//            if((num % 30) == 0){
//                System.out.println("\n");
//            }
//        }

        //ejercicio 12 
//        Scanner sc12 = new Scanner(System.in);
//        int[] array7 = new int[10];
//        
//        String opcion;
//        do {
//            System.out.println("\n a. Mostrar valores
//            \n b. Introducir Valor
//            \n c. Salir");
//            opcion = sc12.nextLine();
//
//            switch (opcion) {
//                case "a": //mostrar valores
//                    for (int num : array7) {
//                        System.out.print(num + " ");
//                    }
//                    break;
        
//                case "b": //introducir
//                    sc12 = new Scanner(System.in);
        
//                    System.out.println("Valor V "); //valor
//                    int v = sc12.nextInt();
        
//                    int p;
//                    do {
//                        System.out.println("Posicion P (0-9)"); //posicion
//                        p = sc12.nextInt();
//                    } while (!(p >= 0 && p <= 9)); //repite mientras no este entre 0 y 9
//
//                    array7[p] = v; //pone valor v, en posicion p
//                        sc12.nextLine();
//                    break;
        
//                case "c":
//                    break;
//            }
//        } while (!opcion.equals("c"));


//        //ejercicio 13 
//        Scanner sc13 = new Scanner(System.in);
//
//        System.out.println("Valor inicio ");
//        int V = sc13.nextInt();
//
//        System.out.println("Intervalo ");
//        int I = sc13.nextInt();
//
//        System.out.println("Valor N (espacio a crear) ");
//        int N = sc13.nextInt();
//
//        int[] nums = new int[N];
//          nums[0] = V; //empieza por valor v
//        
//        for(int i = 1; i < nums.length; i++){
//            nums[i] = nums[i - 1] + I;
//        }
//
//        for(int num : nums){
//            System.out.print(num + " ");
//        }


//        //ejercicio 14
//        int[] array = new int[55];
//        for (int i = 1; i <= 10; i++) { //bucle 1 22 333 4444 55555
//            for (int j = 1; j <= i; j++) {
//                array[i] = i;
//                System.out.print(array[i] + " ");
//
//
//            }
//        }
    }
}
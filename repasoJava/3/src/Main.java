import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ejercicio 1
        Scanner sc = new Scanner(System.in);
//
//        int cantidad;
//        // ///////////////////////
//        int billetes500 = 0;
//        int billetes200 = 0;
//        int billetes100 = 0;
//        int billetes50 = 0;
//        int billetes20 = 0;
//        int billetes10 = 0;
//        int billetes5 = 0;
//        
//        do {
//            System.out.print("Inserte un valor a ser devuelto con cantidad de billetes: ");
//            cantidad = sc.nextInt();
//
//            billetes500 = cantidad / 500;
//            cantidad %= 500;
//
//            if(billetes500 > 0){
//                System.out.println("Billetes 500--> " + billetes500);
//            }
//
//            billetes200 = cantidad / 200;
//            cantidad %= 200;
//
//            if(billetes200 > 0){
//                System.out.println("Billetes 200--> " + billetes200);
//            }
//
//            billetes100 = cantidad / 100;
//            cantidad %= 100;
//
//            if(billetes100 > 0){
//                System.out.println("Billetes 100--> " + billetes100);
//            }
//
//            billetes50 = cantidad / 50;
//            cantidad %= 50;
//
//            if(billetes50 > 0){
//                System.out.println("Billetes 50--> " + billetes50);
//            }
//
//            billetes20 = cantidad / 20;
//            cantidad %= 20;
//
//            if(billetes20 > 0){
//                System.out.println("Billetes 20--> " + billetes20);
//            }
//
//            billetes10 = cantidad / 10;
//            cantidad %= 10;
//
//            if(billetes10 > 0){
//                System.out.println("Billetes 10--> " + billetes10);
//            }
//
//            billetes5 = cantidad / 5;
//            cantidad %= 5;
//
//            if(billetes5 > 0){
//                System.out.println("Billetes 5--> " + billetes5);
//            }
//        } while ((cantidad % 5) != 0);

        //ejercicio 2
         sc = new Scanner(System.in);
         
         int opcion = 5;
         
         do{
             System.out.println("1. Sumar\n" +
                     "2. Restar\n" +
                     "3. Multiplicar\n" +
                     "4. Dividir (incluir manejo de división por 0)\n" +
                     "5. Salir\n");
             opcion = sc.nextInt();
             
             switch(opcion){
                 case 1:
                     sc = new Scanner(System.in);
                     System.out.println("---Eligio suma----");
                     System.out.println("Numero 1");
                     double num1 = sc.nextDouble();

                     System.out.println("Numero 2");
                     double num2 = sc.nextDouble();

                     System.out.println("La suma es: " + (num1 + num2));
                     break;

                 case 2:
                     sc = new Scanner(System.in);
                     System.out.println("---Eligio resta----");
                     System.out.println("Numero 1");
                     double num21 = sc.nextDouble();

                     System.out.println("Numero 2");
                     double num22 = sc.nextDouble();

                     System.out.println("La resta es: " + (num21 - num22));
                     break;

                 case 3:
                     sc = new Scanner(System.in);
                     System.out.println("---Eligio multiplicar----");
                     System.out.println("Numero 1");
                     double num31 = sc.nextDouble();

                     System.out.println("Numero 2");
                     double num32 = sc.nextDouble();
                     

                 System.out.println("La multiplicacion es: " + (num31 * num32));
                 break;
                 
                 case 4:
                     sc = new Scanner(System.in);
                     System.out.println("---Eligio dividir----");
                     System.out.println("Numero 1");
                     double num41 = sc.nextDouble();
                     
                     double num42;
                     do {
                         System.out.println("Numero 2");
                         num42 = sc.nextDouble();
                         
                         if(num42 == 0.0){
                             System.out.println("El denominador = 0, causa un resultado indeterminado");
                         }
                     } while (num42 == 0.0);

                     System.out.println("La division es: " + (num41 / num42));
                 break;
                 
                 case 5:
                     System.out.println("Saliendo....");
                 break;
                 
                 default:
                     System.out.println("Escoja una opcion correcta");
                 break;
             }
             
         }while(opcion != 5);
        
        
        
    }
}
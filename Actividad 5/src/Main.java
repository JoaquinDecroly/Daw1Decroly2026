import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ejercicio 1
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Texto: ");
//        String str = sc.nextLine();
//
//        String[] palabras = str.split(" "); //separar palabra por espacios
//        for(String palabra:palabras){
//            System.out.println(palabra);
//
//        }

        //ejercicio 2
//        Scanner sc1 = new Scanner(System.in);
//
//        System.out.println("Texto 1: ");
//        String str = sc1.nextLine();
//
//        System.out.println("Texto 2: ");
//        String str1 = sc1.nextLine();
//
//        System.out.println(str1.equalsIgnoreCase(str)); //comparar dos textos
//
        //ejercicio 3
//        Scanner sc2 = new Scanner(System.in);
//
//        System.out.println("Nombre: ");
//        String name = sc2.nextLine();
//
//        System.out.println("Apellido 1: ");
//        String surname1 = sc2.nextLine();
//
//        System.out.println("Apellido 2: ");
//        String surname2 = sc2.nextLine();

            //subcadena de (0[inicio], 3[final]) + mayusculas
//        String nameF = name.substring(0,3).toUpperCase();
//        String surnameF1 = surname1.substring(0,3).toUpperCase();
//        String surnameF2 = surname2.substring(0,3).toUpperCase();
//
//        System.out.println(nameF + surnameF1 + surnameF2);

        //ejercicio 4
//        Scanner sc3 = new Scanner(System.in);
//
//        int A = 0;
//        int E = 0;
//        int I = 0;
//        int O = 0;
//        int U = 0;
//
//        System.out.println("Texto: ");
//        String str = sc3.nextLine();
//
//        String str1= str.toLowerCase().trim(); //quitar espacios + minusculas
//
//        for(int i = 0; i < str.length(); i++){
//            char c = str1.charAt(i);
//                switch (c) {
//                    case 'a':
//                        A++;
//                        break;
//                    case 'e':
//                        E++;
//                        break;
//                    case 'i':
//                        I++;
//                        break;
//                    case 'o':
//                        O++;
//                        break;
//                    case 'u':
//                        U++;
//                        break;
//                    default:
//                        break;
//                }
//        }
//
//        System.out.println("Contador A: " + A);
//        System.out.println("Contador E: " + E);
//        System.out.println("Contador I: " + I);
//        System.out.println("Contador O: " + O);
//        System.out.println("Contador U: " + U);

        // ejercicio 5
        Scanner sc5 = new Scanner(System.in);

        boolean esPalindromo = false;

        System.out.println("Introduzca una frase palindromo");
        String texto = sc5.nextLine();

        String palindromo = texto.toLowerCase().trim(); //cambiar a minusculas y quitar espacios

        for(int i = 0; i < (palindromo.length()/2); i++){  //for con longitud texto/2, ya que si es palindrromo la 1era
                                                            // mitad es igual a la 2
            if(palindromo.charAt(i) != palindromo.charAt(palindromo.length() -i -1)){
                //posicion i del texto != posicion texto (inverso)
                break;
            }else{
                esPalindromo = true;
                break;
            }
        }

        if (esPalindromo){
            System.out.println("La frase es un palíndromo (=orden lectura e inverso)");
        }else{
            System.out.println("La frase no es un palíndromo");
        }

    }
}
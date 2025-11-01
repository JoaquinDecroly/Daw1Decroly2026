import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ejercicio 1
//            System.out.println("Palabra: ");
//            String pal = sc.nextLine();
//            
//            String[] w = pal.split(" ");
//            
//            for(String pals : w){
//                System.out.println(pals);
//            }

        //ejercicio 2
//        sc = new Scanner(System.in);
//        System.out.println("Cadena 1");
//        String cdena1 = sc.nextLine();
//
//        System.out.println("Cadena 2");
//        String cdena2 = sc.nextLine();
//        
//        if(cdena1.trim().equalsIgnoreCase(cdena2)){
//            System.out.println("Son iguales pisha");
//        }else{
//            System.out.println("No son iguales pisha");
//        }

        //ejercicio 3
//        sc = new Scanner(System.in);
//        System.out.println("Nombre");
//        String cdena1 = sc.nextLine();
//
//        System.out.println("Apellido 1");
//        String cdena2 = sc.nextLine();
//
//        System.out.println("Apellido 2");
//        String cdena3 = sc.nextLine();
//        
//        System.out.println(cdena1.substring(0,3) +cdena2.substring(0,3) + cdena3.substring(0,3));
//        

        //ejercicio 4
//        sc = new Scanner(System.in);
//        System.out.println("Cadena 1");
//        String cdena1 = sc.nextLine();
//        
//
//        String txt = cdena1.trim().toLowerCase();
//
//        int a = 0;
//        int e = 0;
//        int i = 0;
//        int o = 0;
//        int u = 0;
//        
//        for(int j = 0; j < cdena1.length();j++){
//            char c = txt.charAt(j);
//            switch(c){
//                case 'a':
//                    a++;
//                break;
//                case 'e':
//                    e++;
//                    break;
//                case 'i':
//                    i++;
//                    break;
//                case 'o':
//                    o++;
//                    break;
//                case 'u':
//                    u++;
//                    break;
//            }
//        }
//        System.out.println("a"+ a);
//        System.out.println("e"+e);
//        System.out.println("i"+i);
//        System.out.println("o"+o);
//        System.out.println("u"+u);

        //ejercicio 5
        sc = new Scanner(System.in);
        
        System.out.println("Cadena 1");
        String cdena1 = sc.nextLine();
        
        boolean esPalindromo = false;
        
        String texto = cdena1.trim().toLowerCase();
        
        for(int i = 0;i < (texto.length()/2);i++){
            if(texto.charAt(i) != texto.charAt(texto.length() -i -1)){
                break;
            }else{
                esPalindromo = true;
            }
        }
        
        if(esPalindromo){
            System.out.println("Es palindromo");
        }else{
            System.err.println("No es palindromo");
        }
        

       





    }
}
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // ejercicio 1
        System.out.println("Buenos dias!!!");

        //ejercicio 2
        double lado = 5;
        double area = lado * lado;

        System.out.println("area del cuadrado de lado 5: " + area);

        //ejercicio 3
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el lado del cuadrado: ");
        double lado1 = sc.nextDouble();

        double area1 = lado1 + lado1;

        System.out.println("El area del cuadrado de lado " + lado1 + " es: " + area1);


        //ejercicio 4
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Introduce el numero 1: ");
        double num1 = sc1.nextDouble();

        System.out.println("Introduce el numero 2: ");
        double num2 = sc1.nextDouble();

        System.out.println("La suma es : " + (num1 + num2));
        System.out.println("La resta es : " + (num1 - num2));
        System.out.println("La división es : " + (num1 / num2));
        System.out.println("El producto es: " + (num1 + num2));


        //ejercicio 5
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Radio: ");
        double radio = sc2.nextDouble();

        System.out.println("Longitud circunferencia: " + (2 * Math.PI * radio));
        System.out.println("Area del circulo: " + (Math.PI * (radio * radio)));
        System.out.println("Volumen esfera: " + (4 * Math.PI * (radio * radio * radio)) / 3);


        //ejercicio 6
        Scanner sc3 = new Scanner(System.in);

        System.out.println("Precio de articulo: ");
        double precioArt = sc3.nextDouble();

        System.out.println("Precio real del articulo: ");
        double precioRealArt = sc3.nextDouble();

        System.out.println("El valor del descuento es de:\n " +
                ((precioArt - precioRealArt) / precioArt) * 100);

        //ejercicio 7
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Millas marinas a convertir: ");
        double millas = sc4.nextDouble();

        System.out.println("Equivalencia en metros: " + (millas * 1852));


        //ejercicio 8
        Scanner sc5 = new Scanner(System.in);

        System.out.println("Numero 1: ");
        double num21 = sc5.nextDouble();
        System.out.println("Numero 2: ");
        double num22 = sc5.nextDouble();

        double numMin = Math.min(num21, num22);
        double numMax = Math.max(num21, num22);

        System.out.println("El orden ascendente es: " + numMin + "," + numMax);


        //ejercicio 9

        Scanner sc6 = new Scanner(System.in);

        System.out.println("Numero 1: ");
        double num31 = sc6.nextDouble();
        System.out.println("Numero 2: ");
        double num32 = sc6.nextDouble();

        if (num31 > num32) {
            System.out.println("El numero " + num31 + " es mayor a " + num32);
        } else if (num31 < num32) {
            System.out.println("El numero " + num32 + " es mayor a " + num31);
        } else {
            System.out.println("Los numeros son iguales");
        }



        //ejercicio 10
        Scanner sc7 = new Scanner(System.in);

        System.out.println("Numero 1: ");
        double num41 = sc7.nextDouble();

        System.out.println("Numero 2: ");
        double num42 = sc7.nextDouble();

        System.out.println("Numero 3: ");
        double num43 = sc7.nextDouble();

        double numMax1 = Math.max(num41, num42);
        double numMax2 = Math.max(num42, num43);

        double numMax3 = Math.max(numMax1, numMax2);

        System.out.println("El numero mayor de los 3 números proporcionados \n es: " + numMax3);


        //ejercicio 11
        Scanner sc8 = new Scanner(System.in);

        System.out.println("Numero 1: ");
        double num51 = sc8.nextDouble();

        System.out.println("Numero 2: ");
        double num52 = sc8.nextDouble();

        System.out.println("La suma es : " + (num51 + num52));
        System.out.println("La resta es : " + (num51 - num52));


        double div = num51 / num52;


        if (div == 0) {
            System.out.println("Esta división es indeterminada: " + num51 + "/" + num52);
        } else System.out.println("La división es : " + (num51 / num52));





        System.out.println("El producto es: " + (num51 + num52));


        //ejercicio 12
        Scanner sc9 = new Scanner(System.in);

        System.out.println("Numero 1: ");
        double num61 = sc9.nextDouble();

        System.out.println("Numero 2: ");
        double num62 = sc9.nextDouble();

        System.out.println("El mayor de los dos numeros insertados es:\n "
                + Math.max(num61,num62));



        //ejercicio 13
        Scanner sc10 = new Scanner(System.in);

        System.out.println("Numero 1: ");
        double num71 = sc10.nextDouble();

//        if(num71 > -1){
//            System.out.println("El numero " + num71 + " es positivo");
//        }else System.out.println("El numero " + num71 + " es negativo");

        System.out.println("El numero es positivo: " + (num71 > (-1)));
        System.out.println("El numero es negativo: " + (num71 < 0));
        
    }
}
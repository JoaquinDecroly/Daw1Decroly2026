import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // ejercicio 1
        System.out.println("Buenos dias!!!");

        //ejercicio 2
        int lado = 5;
        int area = lado * lado;

        System.out.println ("area del cuadrado de lado 5: " + area);

        //ejercicio 3
        Scanner sc = new Scanner(System.in);

         System.out.println("Introduce el lado del cuadrado: ");
         double lado1 = sc.nextDouble();

         double area1 = lado1 + lado1;

         System.out.println("El area del cuadrado de lado " + lado1 + "es: " + area1);


         //ejercicio 4
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Introduce el numero 1: ");
        double num1 = sc1.nextDouble();

        System.out.println("Introduce el numero 2: ");
        double num2 = sc1.nextDouble();

        System.out.println("La suma es : " + (num1 + num2));
        System.out.println("La resta es : " + (num1 - num2));
        System.out.println("La división es : " + (num1/num2));
        System.out.println("El producto es: " + (num1 + num2));


        //ejercicio 5
        Scanner sc2 = new Scanner (System.in);

        System.out.println("Radio: ");
        double radio = sc2.nextDouble();

        System.out.println("Longitud circunferencia: " + (2 * Math.PI * radio));
        System.out.println("Area del circulo: " + (Math.PI * (radio * radio)));
        System.out.println("Volumen esfera: " + (4 * Math.PI * (radio * radio * radio))/3);


        //ejercicio 6
        Scanner sc3 = new Scanner(System.in);

        System.out.println("Precio de articulo: ");
        double precioArt = sc3.nextDouble();

        System.out.println("Precio real del articulo: ");
        double precioRealArt = sc3.nextDouble();

        System.out.println("El valor del descuento es de: " +
                ((precioArt - precioRealArt)/precioRealArt));

        //ejercicio 7
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Millas marinas a convertir: ");
        double millas = sc4.nextDouble();

        System.out.println("Equivalencia en metros: " + (millas/1852));


        //ejercicio 8
        Scanner sc5 = new Scanner(System.in);

        System.out.println("Numero 1: ");
        double num21 = sc5.nextDouble();
        System.out.println("Numero 2: ");
        double num22 = sc5.nextDouble();

            double numMin = Math.min(num21, num22);
            double numMax = Math.max(num21, num22);

        System.out.println("El orden ascendente es: " + numMin + numMax);










    }
}
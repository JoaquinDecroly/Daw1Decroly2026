import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------REGLAS------------------------");
        System.out.println("Elegir un numero (piedra|papel|tijera) ");
        System.out.println("La máquina elige un numero aleatorio ");
        System.out.println("Esperar resultado ");
        System.out.println("----------------------------------------------\n");


        int numeroAleatorio = (int) (1 + Math.random() * 3);

        int contadorPiedraJ = 0;
        int contadorPapelJ = 0;
        int contadorTijerasJ = 0;

        int contadorPiedraAI = 0;
        int contadorPapelAI = 0;
        int contadorTijerasAI = 0;

        int contadorV = 0;
        int contadorD = 0;

        String opcion;

        String n1 = "";
        String n2 = "";
        String n3 = "";


        do {
            do {
                System.out.println("\n------Elige tu arma------");
                System.out.println("1 . Piedra");
                System.out.println("2. Papel");
                System.out.println("3. Tijera");
                System.out.println("4. Salir");
                opcion = sc.nextLine();

                if (opcion.equals("4")) {
                    System.out.println("Saliendo...");
                    return;
                }

            } while (!(opcion.equals("1") || opcion.equals("2") || opcion.equals("3")));

            if (!opcion.equals("")) {

                //opcion escogida por ti
                switch (opcion) {
                    case "1":
                        System.out.print("Elegiste piedra\n");
                        System.out.println("-------------------------");
                        System.out.println("elige 1 para confirmar, 0 para volver");
                        n1 = sc.nextLine();

                        if (n1.equals("1")) {
                            System.out.print("Elegiste piedra\n");
                            contadorPiedraJ++;
                            break;

                        } else if (n1.equals("0")) {
                            opcion = "";
                            break;
                        }
                        break;

                    case "2":
                        System.out.print("Elegiste papel\n");
                        System.out.println("-------------------------");
                        System.out.println("elige 1 para confirmar, 0 para volver");
                        n2 = sc.nextLine();

                        if (n2.equals("1")) {
                            System.out.print("Elegiste papel\n");
                            contadorPapelJ++;
                            break;

                        } else if (n2.equals("0")) {
                            opcion = "";
                            break;
                        }
                        break;

                    case "3":
                        System.out.print("Elegiste tijera\n");
                        System.out.println("-------------------------");
                        System.out.println("elige 1 para confirmar, 0 para volver");
                        n3 = sc.nextLine();

                        if (n3.equals("1")) {
                            System.out.print("Elegiste tijera\n");
                            contadorTijerasJ++;
                            break;

                        } else if (n3.equals("0")) {
                            opcion = "";
                            break;
                        }
                        break;

                    case "4":
                        break;
                }
            }// if !opcion.equals("")


            //numero aleatorio maquina
            if (n1.equals("1") || n2.equals("1") || n3.equals("1")){
                switch (numeroAleatorio) {
                    case 1:
                        System.out.println("La máquina eligió piedra\n");
                        break;

                    case 2:
                        System.out.println("La máquina eligió papel\n");
                        break;

                    case 3:
                        System.out.println("La máquina eligió tijera\n");
                        break;
                } 
            }
            
        }while(!(n1.equals("0") || n2.equals("0") || n3.equals("0") || opcion.equals("4")));






    }
}
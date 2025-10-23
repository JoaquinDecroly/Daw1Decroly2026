import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------REGLAS------------------------");
        System.out.println("Elegir un numero (piedra|papel|tijera) ");
        System.out.println("La máquina elige un numero aleatorio ");
        System.out.println("Esperar resultado ");
        System.out.println("----------------------------------------------\n");


        int contadorPiedraJ = 0;
        int contadorPapelJ = 0;
        int contadorTijerasJ = 0;

        int contadorPiedraAI = 0;
        int contadorPapelAI = 0;
        int contadorTijerasAI = 0;

        int contadorV = 0;
        int contadorD = 0;
        int contadorE = 0;


        String opcion = "0";

        String n1 = "";
        String n2 = "";
        String n3 = "";


//        do {
            do {
                System.out.println("\n------Elige tu arma------");
                System.out.println("P . Piedra");
                System.out.println("PA. Papel");
                System.out.println("T. Tijera");
                System.out.println("E. Estadisticas");
                System.out.println("S. Salir");
                opcion = sc.nextLine();
                
                if (!opcion.equals("0")) {//opcion no es 0

                    //opcion escogida por ti
                    switch (opcion.toUpperCase()) {

                        case "P": //piedra
                            System.out.print("Elegiste piedra\n");
                            System.out.println("-------------------------");
                            System.out.println("elige 1 para confirmar, 0 para volver");
                            n1 = sc.nextLine();

                            if (n1.equals("1")) {//elegir piedra y ++
                                System.out.print("Elegiste piedra\n");
                                opcion = "1";
                                contadorPiedraJ++;
                                break;

                            } else if (n1.equals("0")) {//opcion = 0 y romper
                                opcion = "0";
                                break;
                                
                            }else if(n1.isBlank()) { //confirmar como intro
                                System.out.print("Se tomara de manera automatica "+"confirmar"+"\n");
                                System.out.print("\nElegiste piedra\n");
                                opcion = "1";
                                n1 = "1";
                                break;
                            }
                            
                            break;

                        case "PA": //papel
                            System.out.print("Elegiste papel\n");
                            System.out.println("-------------------------");
                            System.out.println("elige 1 para confirmar, 0 para volver");
                            n2 = sc.nextLine();

                            if (n2.equals("1")) {//elegir papel y ++
                                System.out.print("\nElegiste papel\n");
                                opcion = "2";
                                contadorPapelJ++;
                                break;

                            } else if (n2.equals("0")) {//opcion = 0 y romper
                                opcion = "0";
                                break;
                                
                            }else if(n2.isBlank()){//confirmar como intro
                                System.out.print("Se tomara de manera automatica "+"confirmar"+"\n");
                                System.out.print("\nElegiste papel\n");
                                opcion = "2";
                                n2 = "1";
                                break;
                            }
                            
                            break;

                        case "T": //tijera
                            System.out.print("Elegiste tijera\n");
                            System.out.println("-------------------------");
                            System.out.println("elige 1 para confirmar, 0 para volver");
                            n3 = sc.nextLine();

                            if (n3.equals("1")) {//elegir tijera y ++
                                System.out.print("\nElegiste tijera\n");
                                opcion = "3";
                                contadorTijerasJ++;
                                break;

                            } else if (n3.equals("0")) {//opcion = 0 y romper
                                opcion = "0";
                                break;
                                
                            }else if(n3.isBlank()) {//confirmar como intro
                                System.out.print("Se tomara de manera automatica "+"confirmar"+"\n");
                                System.out.print("\nElegiste tijera\n");
                                opcion = "3";
                                n3 = "1";
                                break;
                            }
                            
                            break;

                        case "E"://mostrar contadores
                            System.out.println("---------ESTADISTICAS-----------");
                            System.out.println("-PapelJugador " + contadorPapelJ + "\n-PiedraJugador " + contadorPiedraJ
                                    + "\n-TijeraJugador " + contadorTijerasJ
                                    + "\n------------------\n"
                                    + "-PapelAI " + contadorPapelAI + "\n-PiedraAI " + contadorPiedraAI
                                    + "\n-TijeraAI " + contadorTijerasAI
                                    + "\n------------------\n"
                                    + "-Victorias " + contadorV + "\n-Derrotas " + contadorD
                                    + "\n-Empates " + contadorE);

                            break;

                        case "S"://salir
                            System.out.println("Saliendo...");
                            break;
                        
                        default:
                            System.out.println("Escoja una opcion correcta!");
                    }


                    if (!(opcion.equals("S") || opcion.equals("0") || opcion.isEmpty())) { //no entrar salida ni opcion = 0

                        if(opcion.equals("1") || opcion.equals("2") || opcion.equals("3")){ //ver si la opcion es 1, 2 o 3
                            
                            if (n1.equals("1") || n2.equals("1") || n3.equals("1")) { // opciones 1 para confirmar

                                int numeroAleatorio = (int) (1 + Math.random() * 3);//numero aleatorio maquina

                                    if (!opcion.equals("E")) {//+ opcion distinta 4
    
                                        switch (numeroAleatorio) {//opcion maquina
                                            case 1:
                                                System.out.println("\nLa máquina eligió piedra");
                                                contadorPiedraAI++;
                                                break;
    
                                            case 2:
                                                System.out.println("\nLa máquina eligió papel");
                                                contadorPapelAI++;
                                                break;
    
                                            case 3:
                                                System.out.println("\nLa máquina eligió tijera");
                                                contadorTijerasAI++;
                                                break;
                                        }
    
                                        if (Integer.parseInt(opcion) == numeroAleatorio) {//a == b, empate
                                            System.out.println("--------------------------\n");
                                            System.out.println("Empate!");
                                            contadorE++;
    
                                        } else if (opcion.equals("P") && numeroAleatorio == 3 || opcion.equals("PA") && numeroAleatorio == 1
                                                || opcion.equals("T") && numeroAleatorio == 2) {//opciones ganadoras del jugador
                                            System.out.println("--------------------------\n");
                                            System.out.println("Ganaste!");
                                            contadorV++;
                                        } else {
                                            System.out.println("--------------------------\n");//si no opciones ganadoras
                                            System.out.println("Perdiste!");
                                            contadorD++;
                                        }
                                    }
                            } 
                        }
                        
                        
                    }
                }
            } while (!opcion.equals("S"));

          
//        }while (!(n1.equals("2") || n2.equals("2") || n3.equals("3") || opcion.equals("5"))) ;
           
        }
    }
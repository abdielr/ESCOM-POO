package Banco;
import java.util.Scanner;
/*
 * Reyes Rodriguez Enrique Abdiel
 * 2CM11
 * POO
 *
 *
 */

public class Main {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.printf("Bienvenidos a bancoaztec!\n ingrese el monto inicial ");
                Banco B1 = new Banco(in.nextInt());
                boolean salir = false;
                int opcion;

                while(!salir){
                    System.out.printf("Ingrese su opcion:\n");
                    System.out.printf("\t1. Consultar Saldo\n");
                    System.out.printf("\t2. Depositar\n");
                    System.out.printf("\t3. Retirar\n");
                    System.out.printf("\t4. Salir\n");
                    opcion = in.nextInt();

                    switch(opcion){
                        case 1:
                            B1.Consulta();
                            break;
                        case 2:
                            System.out.println("Ingrese la cantidad a depositar: ");
                            B1.Deposito(in.nextFloat());
                            break;
                        case 3:
                            System.out.println("Ingrese la cantidad a retirar: ");
                            B1.Retiro(in.nextFloat());
                            break;
                        case 4:
                            salir=true;
                            break;
                         default:
                                System.out.println("Solo números entre 1 y 4");
                    }
                     
                }
                in.close();
        }
}

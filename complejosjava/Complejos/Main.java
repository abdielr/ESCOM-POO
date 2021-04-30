package Complejos;
import java.util.Scanner;
/*
 * Reyes Rodriguez Enrique Abdiel
 * 2CM11
 * POO
 *
 */
public class Main {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.printf("Ingrese el numero real del primer complejo:");
                Complejos C1 = new Complejos(in.nextInt(), 0);
                System.out.printf("Ingrese el numero imaginario del primer complejo:");
                C1.setImaginario(in.nextInt());
                System.out.printf("Ingrese el numero real del segundo complejo:");
                Complejos C2 = new Complejos(in.nextInt(), 0);
                System.out.printf("Ingrese el numero imaginario de segundo complejo:");
                C2.setImaginario(in.nextInt());
                Scanner sn = new Scanner(System.in); 
                boolean salir = false;
                int opcion;
                Complejos C3 = new Complejos(0, 0);

                while(!salir){
                    System.out.printf("1.Suma\n");
                    System.out.printf("2.Resta\n");
                    System.out.printf("3.Multiplicacion\n");
                    System.out.printf("4.Division\n");
                    System.out.printf("5.Modulo\n");
                    System.out.printf("6.Equals\n");
                    System.out.printf("7.Salir");
                    opcion = sn.nextInt();

                    switch(opcion){
                        case 1:
                            C3 = C1.suma(C2);
                            C3.imprimir();
                            break;
                        case 2:
                            C3 = C1.resta(C2);
                            C3.imprimir();
                            break;
                        case 3:
                            C3 = C1.multi(C2);
                            C3.imprimir();
                            break;
                        case 4:
                            C3 = C1.divi(C2);
                            C3.imprimir();
                            break;
                        case 5:
                            Scanner mod = new Scanner(System.in);
                            System.out.println("\f Seleccione el modulo:");
                            System.out.println("\f 1) Primero");
                            System.out.println("\f 2) Segundo");
                            System.out.println("\f 3) Suma de ambos");
                            int choi = mod.nextInt();
                            if(choi == 1){
                                System.out.println("El modulo es:"+ C1.modulo());
                                break;
                            }
                            else if(choi == 2){
                                System.out.println("El modulo es:" + C2.modulo());
                                break;
                            }
                            else if(choi == 3){
                                C3 = C1.suma(C2);
                                System.out.println("El modulo es:" + C3.modulo());
                                break;
                            }
                            else{
                                System.out.println("Opcion no valida");
                                break;
                            }
                        case 6:
                                C1.esIgual(C2);
                                break;
                        case 7:
                                salir=true;
                                break;
                         default:
                                System.out.println("Opcion no valida");
                                break;
                    }
                     
                }
                sn.close();
        }
}

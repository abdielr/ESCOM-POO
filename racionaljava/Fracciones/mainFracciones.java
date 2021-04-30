package Fracciones;
import java.util.Scanner;
/*
 * Reyes Rodriguez Enrique Abdiel
 *  2CM11
 *  POO
 *
 * */
public class mainFracciones {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.printf("Ingrese el numerador del primer racional:");
                Fracciones F1 = new Fracciones(in.nextInt(), 0);
                System.out.printf("Ingrese el denominador del primer racional:");
                F1.setDenominador(in.nextInt());
                System.out.printf("Ingrese el numerador del segundo racional:");
                Fracciones F2 = new Fracciones(in.nextInt(), 0);
                System.out.printf("Ingrese el denominador del segundo racional:");
                F2.setDenominador(in.nextInt());
               
                Scanner sn = new Scanner(System.in); 
                boolean salir = false;
                int opcion;
                 //opt menu
                while(!salir){
                    System.out.println("1. Suma");
                    System.out.println("2. Resta");
                    System.out.println("3. Salir");
                    opcion = sn.nextInt();
                    switch(opcion){
                        case 1:
                            if(F1.getDenominador() == 0 || F2.getDenominador() == 0){
                                System.out.println("No determinado ya que es division sobre cero");
                                break;
                            }
                            else if(F1.getNumerador() == 0 && F2.getNumerador() == 0){
                                System.out.println("La suma es igual a 0");
                                break;
                            }
                            else{
                                Fracciones F3 = F1.suma(F2);
                                System.out.println("La suma es igual a:" + F3.getNumerador()+"/"+ F3.getDenominador());
                                break;
                            }
                        case 2:
                            if(F1.getDenominador() == 0 || F2.getDenominador() == 0){
                                System.out.println("No determinado ya que es division sobre cero");
                                break;
                            }
                            else if(F1.getNumerador() == 0 && F2.getNumerador() == 0){
                                System.out.println("La suma es igual a 0");
                                break;
                            }
                            else{
                                Fracciones F3 = F1.resta(F2);
                                System.out.println("La resta es igual a:" + F3.getNumerador()+"/"+ F3.getDenominador());
                                break;
                            }
                         case 3:
                            salir=true;
                            break;
                         default:
                            System.out.println("Solo números entre 1 y 3");
                    }
                     
                }
                sn.close();
        }
}

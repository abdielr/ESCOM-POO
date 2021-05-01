import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int cantidad;
        Scanner scanner = new Scanner(System.in);
        Carrete carrete = new Carrete();

        System.out.println("\nIngresa una cantidad de tela: ");
        cantidad = scanner.nextInt();
        carrete.cortar(cantidad);
    }
}
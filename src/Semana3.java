import java.util.Scanner;

public class Semana3 {
    public static void main(String[] args) {
        // Comentarios
        // Cualquier cosa

        /* Cualquier cosa
           y otra cosa */

        // Tipos de Datos
        short numeroEntero1 = 1;
        byte numeroEntero2 = 5;
        int numeroEntero3 = 10; // Usen este
        long numeroEntero4 = 100;

        float numeroDecimal1 = 3.14f;
        double numeroDecimal2 = 3.14; // Usen este

        char letra = 'A';
        String texto = "Hablen, pelaos!";

        boolean esVerdadero = true;

        // Operador Matematico
        int suma = numeroEntero1 + 37;
        System.out.println("El resultado es " + suma);

        // Lectura por teclado
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numero Entero: ");
        int numeroLeido = scanner.nextInt();
        System.out.println("El numero leido es " + numeroLeido);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el valor de X: ");
        double X = scanner.nextDouble();

        System.out.print("Ingresa el valor de Y: ");
        double Y = scanner.nextDouble();

        double suma = X + Y;
        double resta = X - Y;
        double multiplicacion = X * Y;

        double division = (Y != 0) ? X / Y : Double.POSITIVE_INFINITY;

        double modulo = (Y != 0) ? X % Y : Double.NaN;

        System.out.println("X = " + X);
        System.out.println("Y = " + Y);
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);

        scanner.close();
    }
}

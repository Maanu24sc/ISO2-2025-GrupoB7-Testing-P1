package problema1;
import java.util.InputMismatchException;  // Importa la clase Scanner
import java.util.Scanner;  // Importa la clase InputMismatchException


public class GestorIO {
    private Scanner scanner;

    public GestorIO() {
        this.scanner = new Scanner(System.in);
    }

    public void escribirCadena(String mensaje) {
        System.out.println(mensaje);
    }

    public void escribirResultado(String mensaje) {
        System.out.println(">>> " + mensaje);
    }

    public void escribirError(String mensaje) {
        System.err.println("ERROR: " + mensaje);
    }

    public int leerEntero(String mensaje) throws DatosNoValidosException {
        System.out.print(mensaje + ": ");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.next(); // Limpiar el buffer del scanner
            throw new DatosNoValidosException("El valor introducido no es un número entero válido.");
        }
    }

    public Fecha leerFecha() throws DatosNoValidosException {
        escribirCadena("\n--- Introduzca los datos de la fecha ---");
        int dia = leerEntero("Día");
        int mes = leerEntero("Mes");
        int anio = leerEntero("Año");
        return new Fecha(dia, mes, anio);
    }

    public boolean leerConfirmacion(String mensaje) {
        System.out.print(mensaje + " (s/n): ");
        String res = scanner.next();
        return res.equalsIgnoreCase("s");
    }

    public void cerrar() {
        scanner.close();
    }

    // No cerramos el scanner aquí, lo dejamos para el Main.
}
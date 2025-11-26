import java.util.Scanner;

public class Principal {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            System.out.print("Introduce el año: ");
            String entrada = scanner.next();

            int fecha;

            try {
                fecha = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                throw new ExcepcionCaracter("No se admiten caracteres.");
            }

            ComprobarBisiesto comprobar = new ComprobarBisiesto(fecha);

            if (comprobar.esBisiesto()) {
                System.out.println("El año es bisiesto.");
            } else {
                System.out.println("El año no es bisiesto.");
            }

        } catch (ExcepcionCaracter | ExcepcionNegativo e) {
            System.out.println(e.getMessage());
        }
    }
}
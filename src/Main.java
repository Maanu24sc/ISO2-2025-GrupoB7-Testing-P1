public class Main {
    public static void main(String[] args) {
        GestorIO io = new GestorIO();
        boolean continuar = true;

        io.escribirCadena("=== VERIFICADOR DE AÑOS BISIESTOS ===");

        while (continuar) {
            try {
                // 1. Lectura de datos
                Fecha fecha = io.leerFecha();

                // 2. Lógica de negocio
                boolean esBisiesto = fecha.esBisiesto();

                // 3. Resultado
                String resultado = esBisiesto ? "SÍ es un año bisiesto." : "NO es un año bisiesto.";
                io.escribirResultado("La fecha " + fecha.toString() + " corresponde a un año que " + resultado);

            } catch (DatosNoValidosException e) {
                io.escribirError(e.getMessage());
            } catch (Exception e) {
                io.escribirError("Ocurrió un error inesperado: " + e.getMessage());
            }

            continuar = io.leerConfirmacion("\n¿Desea comprobar otra fecha?");
        }

        io.escribirCadena("Programa finalizado.");
        io.cerrar();
    }
}

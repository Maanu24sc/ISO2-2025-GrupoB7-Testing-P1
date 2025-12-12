package problema1;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {

    // --- Pruebas de Caja Negra (Clases de Equivalencia) ---

    // 1. Año Bisiesto divisible por 4 pero NO por 100 (Ej: 2024)
    @Test
    public void testBisiestoTipico() {
        ComprobarBisiesto detector = new ComprobarBisiesto();
        try {
            detector.setFecha(2024); // Establecemos fecha válida
            boolean resultado = detector.esBisiesto();
            assertTrue("2024 debería ser bisiesto", resultado);
        } catch (DatosNoValidosException e) {
            fail("No debería lanzar excepción con un año válido");
        }
    }

    // 2. Año Bisiesto divisible por 400 (Ej: 2000)
    @Test
    public void testBisiestoSiglo() {
        ComprobarBisiesto detector = new ComprobarBisiesto();
        try {
            detector.setFecha(2000);
            assertTrue("2000 debería ser bisiesto", detector.esBisiesto());
        } catch (DatosNoValidosException e) {
            fail("Excepción no esperada");
        }
    }

    // 3. Año NO Bisiesto (No divisible por 4) (Ej: 2023)
    @Test
    public void testNoBisiestoComun() {
        ComprobarBisiesto detector = new ComprobarBisiesto();
        try {
            detector.setFecha(2023);
            assertFalse("2023 no debería ser bisiesto", detector.esBisiesto());
        } catch (DatosNoValidosException e) {
            fail("Excepción no esperada");
        }
    }

    // 4. Año NO Bisiesto (Divisible por 100 pero NO por 400) (Ej: 1900)
    @Test
    public void testNoBisiestoSiglo() {
        ComprobarBisiesto detector = new ComprobarBisiesto();
        try {
            detector.setFecha(1900);
            assertFalse("1900 no debería ser bisiesto", detector.esBisiesto());
        } catch (DatosNoValidosException e) {
            fail("Excepción no esperada");
        }
    }

    // --- Prueba de Manejo de Errores (Valor Límite / Invalido) ---

    // 5. Año Negativo -> Debe lanzar Excepción
    @Test(expected = DatosNoValidosException.class)
    public void testFechaInvalidaNegativo() throws DatosNoValidosException {
        ComprobarBisiesto detector = new ComprobarBisiesto();
        detector.setFecha(-1); // Esto debe lanzar la excepción inmediatamente
    }
}

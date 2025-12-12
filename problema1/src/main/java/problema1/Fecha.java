package problema1;
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    /**
     * Constructor que valida y establece la fecha.
     * Lanza excepción si el año es negativo o si el mes o el día son inválidos.
     */
    public Fecha(int dia, int mes, int anio) throws DatosNoValidosException {
        if (mes < 1 || mes > 12) {
            throw new DatosNoValidosException("El mes debe estar entre 1 y 12.");
        }
        if (dia < 1 || dia > 31) {
            throw new DatosNoValidosException("El día debe estar entre 1 y 31.");
        }

        // Validación crítica: año no negativo
        setAnio(anio);  // Llama a setAnio para validarlo
        this.dia = dia;
        this.mes = mes;
    }

    public void setAnio(int anio) throws DatosNoValidosException {
        if (anio < 0) {
            throw new DatosNoValidosException("El año no puede ser negativo.");
        }
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

    /**
     * Lógica principal del problema.
     * Devuelve true si el año es bisiesto, false si no lo es.
     * Regla: Divisible entre 4, NO divisible entre 100, SALVO que sea divisible entre 400.
     */
    public boolean esBisiesto() {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%d", dia, mes, anio);
    }
}

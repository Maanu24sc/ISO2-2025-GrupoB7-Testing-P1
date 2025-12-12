package problema1;

public class ComprobarBisiesto {
    private int fecha;

    /**
     * Constructor vacío necesario para los tests que instancian el objeto
     * y luego establecen la fecha con setFecha().
     */
    public ComprobarBisiesto() {
        // Inicializa a 0 o un valor neutro si es necesario
        this.fecha = 0; 
    }

    /**
     * Constructor con parámetro para inicialización directa.
     */
    public ComprobarBisiesto(int fecha) throws DatosNoValidosException {
        setFecha(fecha);
    }

    public boolean esBisiesto() {
        int year = this.fecha;

        // Lógica de los años bisiestos
        if (year % 400 == 0) 
            return true;
        if (year % 100 == 0) 
            return false;
        return year % 4 == 0;
    }

    public void setFecha(int fecha) throws DatosNoValidosException {
        if (fecha < 0) {
            throw new DatosNoValidosException("No se admiten valores negativos.");
        }
        this.fecha = fecha;
    }

    public int getFecha() {
        return this.fecha;
    }
}

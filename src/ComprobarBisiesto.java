public class ComprobarBisiesto {
    private int fecha;

    public ComprobarBisiesto(int fecha) throws ExcepcionNegativo {
        setFecha(fecha);
    }

    public boolean esBisiesto() {
        int year = this.fecha;

        // regla correcta del calendario gregoriano
        if (year % 400 == 0) 
            return true;
        if (year % 100 == 0) 
            return false;
        return year % 4 == 0;
    }

    public void setFecha(int fecha) throws ExcepcionNegativo {
        if (fecha < 0) {
            throw new ExcepcionNegativo("No se admiten valores negativos.");
        }
        this.fecha = fecha;
    }

    public int getFecha() {
        return this.fecha;
    }
}
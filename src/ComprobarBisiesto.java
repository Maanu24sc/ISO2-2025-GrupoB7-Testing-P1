public class ComprobarBisiesto {
    private int fecha;

    public ComprobarBisiesto(int fecha) throws ExcepcionNegativo {
        this.setFecha(fecha);
    }

    public boolean esBisiesto() {
        return this.fecha % 4 == 0;
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
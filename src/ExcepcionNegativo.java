

public class ExcepcionNegativo extends Exception{
    private final String codigoError;

    public ExcepcionNegativo(String mensaje){
        super(mensaje);
        this.codigoError = "No se admiten valores negativos.";
    }
}
public class ExcepcionCaracter extends Exception{
    private final String codigoError;

    public ExcepcionCaracter(String mensaje){
        super(mensaje);
        this.codigoError = "No se admiten caracteres.";
    }
}
public class Escritura {
    private static int contador;
    public Integer numero;
    public int superficie;
    private String domicilio;

    public Escritura(int superficie, String domicilio) {
        this.numero = ++Escritura.contador;
        this.superficie = superficie;
        this.domicilio = domicilio;
    }
}



import java.util.ArrayList;

public class Lote {
    private static int contador = 0;
    public Integer idPadron;
    public String domicilio;
    private float avaluoxmt;
    public int superficie;
    public Registro inscripto;
    private ArrayList<Edificio> construccion = new ArrayList();

    public Lote(String domicilio, int superficie) {
        this.idPadron = ++Lote.contador;
        this.domicilio = domicilio;
        this.superficie = superficie;
    }

    public float valuar(){
        return avaluoxmt * superficie;
    }

    public void construir(Edificio edificio){
        construccion.add(edificio);
    }

    @Override
    public String toString() {
        return "Lote Nº" + idPadron + ", domicilio: " + domicilio + ", superficie: " + superficie;
    }
}

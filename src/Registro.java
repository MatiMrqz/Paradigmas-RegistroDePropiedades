import java.util.ArrayList;

public class Registro {
    public static float coefAvaluoEdificio;
    public String municipio;
    private float tasa;
    private ArrayList<Escritura> escrituras = new ArrayList<Escritura>();

    private Lote inmuebles[] = new Lote[0];

    public Registro() {
    }

    public float getTasa() {
        return tasa;
    }

    public void setTasa(float tasa) {
        this.tasa = tasa;
    }

    public Escritura registrar(Lote lote){
        this.insertarLote(lote);
        lote.inscripto = this;
        Escritura miEscritura = new Escritura(lote.superficie,lote.domicilio);
        escrituras.add(miEscritura);
        return miEscritura;
    }

    public float valuar(Lote lote){
        return lote.valuar()*Registro.coefAvaluoEdificio;
    }

    public void emitirBoletos(){
        //con for
        for(int i=0; i< inmuebles.length; i++ ){
            System.out.println("El lote es "+inmuebles[i].toString());
        }
    }

    private void insertarLote(Lote nuevoLote){
        int newLength = inmuebles.length + 1;
        Lote[] newLoteArr = new Lote[newLength];
        System.arraycopy(inmuebles, 0, newLoteArr, 0, inmuebles.length);
        newLoteArr[inmuebles.length] = nuevoLote;
        this.inmuebles = newLoteArr;
    }
}


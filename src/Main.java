//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Registro capital = new Registro();
        capital.municipio = "Capital MZA";
        capital.setTasa(10);
        Lote utn = new Lote("rodriguez 222",2000);
        Lote mendoza = new Lote("Aristides 3333",1234);
        Lote prueba = new Lote("San Martin 4444",1234);
        capital.registrar(utn);
        capital.registrar(mendoza);
        capital.registrar(prueba);
        capital.emitirBoletos();
    }
}
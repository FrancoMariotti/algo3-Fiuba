import java.util.List;

public class Letra {
    private String letra;
    private int peso;
    private TipoDeLetra tipoDeLetra;

    public  Letra(String letra, TipoDeLetra tipo, int peso, List<Regla> reglas) {
        for (Regla regla:reglas) {
            regla.validar(letra,peso);
        }
        this.letra = letra;
        this.peso = peso;
        this.tipoDeLetra = tipo;
    }

    public int getPeso() {
        return tipoDeLetra.modificarPeso(peso);
    }
}

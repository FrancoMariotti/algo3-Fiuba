import java.util.LinkedList;
import java.util.List;

public class FabricaDeLetras implements IFabricaDeLetras{

    @Override
    public Letra crear(String letra, int peso) {
        List<Regla> reglas = new LinkedList<>();
        TipoDeLetra tipo = obtenerTipoDeLetra(letra);
        return new Letra(letra,tipo,peso,reglas);
    }

    private TipoDeLetra obtenerTipoDeLetra(String letra) {
        if(letra.toLowerCase().equals("a") ||
                letra.toLowerCase().equals("e") ||
                letra.toLowerCase().equals("i") ||
                letra.toLowerCase().equals("o") ||
                letra.toLowerCase().equals("u"))
            return new Vocal();
        return new NoVocal();
    }
}

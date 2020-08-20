package musicos;

import instrumentos.Charango;
import instrumentos.GuitarraCriolla;
import instrumentos.Instrumento;
import instrumentos.Piano;

public interface Musico {
    int tocar(Instrumento instrumento);
    int tocar(Charango charango);
    int tocar(Piano piano);
    int tocar(GuitarraCriolla guitarraCriolla);
}

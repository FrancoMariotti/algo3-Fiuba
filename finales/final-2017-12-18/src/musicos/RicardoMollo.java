package musicos;

import instrumentos.Charango;
import instrumentos.GuitarraCriolla;
import instrumentos.Instrumento;
import instrumentos.Piano;

public class RicardoMollo implements Musico {
	@Override
	public int tocar(Instrumento instrumento) {
		return instrumento.serTocadoPor(this);
	}

	@Override
	public int tocar(Charango charango) {
		return 0;
	}

	@Override
	public int tocar(Piano piano) {
		return 0;
	}

	@Override
	public int tocar(GuitarraCriolla guitarraCriolla) {
		return guitarraCriolla.sonar();
	}
}

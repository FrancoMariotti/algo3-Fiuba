package instrumentos;

import musicos.Musico;

public abstract class GuitarraCriolla implements Instrumento{
	protected int decibeles;

	public GuitarraCriolla() {
		this.decibeles = 20;
	}

	@Override
	public int serTocadoPor(Musico musico) {
		return musico.tocar(this);
	}

	public abstract int sonar();

}

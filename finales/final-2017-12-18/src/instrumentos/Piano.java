package instrumentos;

import musicos.Musico;

public abstract class Piano implements Instrumento {
	protected int decibeles;

	public Piano() {
		this.decibeles = 50;
	}

	@Override
	public int serTocadoPor(Musico musico) {

		return musico.tocar(this);
	}

	public abstract int sonar();
}

package instrumentos;

import musicos.Musico;

public abstract class Charango implements Instrumento {

	protected int decibeles;
	public Charango() {
		this.decibeles = 10;
	}

	@Override
	public int serTocadoPor(Musico musico) {
		return musico.tocar(this);
	}

	public abstract int sonar();
}

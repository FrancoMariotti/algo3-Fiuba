package instrumentos;

import musicos.Musico;

public abstract class Saxo implements Instrumento {
    protected int decibeles;

    public Saxo() {
        this.decibeles = 30;
    }

    @Override
    public int serTocadoPor(Musico musico) {
        return musico.tocar(this);
    }

    public abstract int sonar();
}

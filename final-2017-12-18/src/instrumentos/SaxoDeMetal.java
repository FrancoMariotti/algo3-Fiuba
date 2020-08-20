package instrumentos;

public class SaxoDeMetal extends Saxo {
    public SaxoDeMetal() {
        super();
    }

    @Override
    public int sonar() {
        return decibeles * 3;
    }
}

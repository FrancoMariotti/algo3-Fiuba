package instrumentos;

public class CharangoDeMadera extends Charango {

    public CharangoDeMadera() {
        super();
    }

    @Override
    public int sonar() {
        return decibeles * 2;
    }
}

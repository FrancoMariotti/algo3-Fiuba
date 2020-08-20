package instrumentos;

public class PianoDeMadera extends Piano{
    public PianoDeMadera() {
        super();
    }

    @Override
    public int sonar() {
        return decibeles * 3;
    }
}

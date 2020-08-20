package instrumentos;

public class PianoDePlastico extends Piano{
    public PianoDePlastico() {
        super();
    }

    @Override
    public int sonar() {
        return decibeles - 5;
    }
}

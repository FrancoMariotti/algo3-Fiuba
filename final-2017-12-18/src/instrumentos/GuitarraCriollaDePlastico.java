package instrumentos;

public class GuitarraCriollaDePlastico extends GuitarraCriolla{

    public GuitarraCriollaDePlastico() {
        super();
    }

    @Override
    public int sonar() {
        return decibeles - 3;
    }
}

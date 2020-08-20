package instrumentos;

public class GuitarraCriollaDeMadera extends GuitarraCriolla{

    public GuitarraCriollaDeMadera() {
        super();
    }

    @Override
    public int sonar() {
        return decibeles;
    }
}

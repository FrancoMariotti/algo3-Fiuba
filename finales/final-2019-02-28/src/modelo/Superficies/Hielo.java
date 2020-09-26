package modelo.Superficies;

import modelo.acciones.Corredor;

public class Hielo implements Superficie {
    @Override
    public int afectarVelocidadDe(Corredor corredor) {
        return corredor.correrEn(this);
    }
}

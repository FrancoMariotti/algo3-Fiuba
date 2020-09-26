package modelo.Superficies;

import modelo.acciones.Corredor;

public class PistaDeAtletismo implements Superficie {
    public int afectarVelocidadDe(Corredor corredor) {
        return corredor.correrEn(this);
    }
}
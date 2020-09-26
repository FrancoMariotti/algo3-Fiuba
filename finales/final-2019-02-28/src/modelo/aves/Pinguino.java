package modelo.aves;

import modelo.acciones.Corredor;
import modelo.acciones.Nadador;
import modelo.Superficies.Barro;
import modelo.Superficies.Hielo;
import modelo.Superficies.PistaDeAtletismo;
import modelo.Superficies.Superficie;

public class Pinguino implements Corredor, Nadador {
    @Override
    public int correrEn(Superficie superficie) {
        return superficie.afectarVelocidadDe(this);
    }

    @Override
    public int correrEn(PistaDeAtletismo pistaDeAtletismo) {
        return 0;
    }

    @Override
    public int correrEn(Hielo hielo) {
        return 5;
    }

    @Override
    public int correrEn(Barro barro) {
        return 0;
    }

    @Override
    public int nadar() {
        return 20;
    }
}

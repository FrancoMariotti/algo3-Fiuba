package modelo.acciones;

import modelo.Superficies.Barro;
import modelo.Superficies.Hielo;
import modelo.Superficies.PistaDeAtletismo;
import modelo.Superficies.Superficie;

public interface Corredor {
    int correrEn(Superficie superficie);
    int correrEn(PistaDeAtletismo pistaDeAtletismo);
    int correrEn(Hielo hielo);
    int correrEn(Barro barro);
}
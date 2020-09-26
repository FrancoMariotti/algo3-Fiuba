package Fabricas;

import Efectos.DarVuelta;
import Efectos.Efecto;
import Efectos.EfectoCompuesto;
import Efectos.PrimeraLetraMayuscula;

public class FabricaDeEfectoDarVueltaYPrimeraMayuscula implements FabricaDeEfectos {
    @Override
    public Efecto crear() {
        EfectoCompuesto efectoCompuesto = new EfectoCompuesto();
        efectoCompuesto.agregar(new DarVuelta());
        efectoCompuesto.agregar(new PrimeraLetraMayuscula());
        return efectoCompuesto;
    }
}

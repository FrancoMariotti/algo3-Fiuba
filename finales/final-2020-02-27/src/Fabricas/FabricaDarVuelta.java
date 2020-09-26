package Fabricas;

import Efectos.DarVuelta;
import Efectos.Efecto;

public class FabricaDarVuelta implements FabricaDeEfectos{
    @Override
    public Efecto crear() {
        return new DarVuelta();
    }
}

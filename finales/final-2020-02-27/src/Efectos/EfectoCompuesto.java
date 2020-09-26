package Efectos;

import Efectos.Efecto;

import java.util.ArrayList;
import java.util.List;

public class EfectoCompuesto implements Efecto {
    private List<Efecto> efectos;

    public EfectoCompuesto() {
        efectos = new ArrayList<>();
    }

    public void agregar(Efecto efecto) {
        efectos.add(efecto);
    }

    @Override
    public String aplicarA(String cadena) {
        for (Efecto efecto: efectos) {
            cadena = efecto.aplicarA(cadena);
        }

        return cadena;
    }
}

package Efectos;

import Efectos.Efecto;

public class PrimeraLetraMayuscula implements Efecto {

    public String aplicarA(String cadena) {
        return cadena.substring(0,1).toUpperCase() + cadena.substring(1);
    }
}

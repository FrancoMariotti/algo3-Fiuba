package Efectos;

import Efectos.Efecto;

public class PrimeraLetraMinuscula implements Efecto {
    @Override
    public String aplicarA(String cadena) {
        return cadena.substring(0,1).toLowerCase() + cadena.substring(1);
    }
}

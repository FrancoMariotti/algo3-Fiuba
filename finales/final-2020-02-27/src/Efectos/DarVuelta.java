package Efectos;

public class DarVuelta implements Efecto {
    public String aplicarA(String cadena) {
        return  new StringBuffer(cadena).reverse().toString();
    }
}

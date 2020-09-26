package Efectos;

public class CadenaAlFinal implements Efecto {
    private String cadena;

    public CadenaAlFinal(String cadena) {
        this.cadena = cadena;
    }

    @Override
    public String aplicarA(String cadena) {
        return cadena + this.cadena;
    }
}

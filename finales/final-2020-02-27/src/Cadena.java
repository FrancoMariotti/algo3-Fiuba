import Efectos.Efecto;

public class Cadena {
    private String valor;

    public Cadena(String valor) {
        if(valor.length() == 0) {
            throw new CadenaVaciaException();
        }
        this.valor = valor;
    }

    public void aplicar(Efecto efecto) {
        valor = efecto.aplicarA(valor);
    }

    public String getValor() {
        return this.valor;
    }
}

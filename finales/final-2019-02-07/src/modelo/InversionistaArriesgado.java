package modelo;

public class InversionistaArriesgado implements Inversionista {
    @Override
    public int invertir(int monto, Inversion inversion) {
        return inversion.recibirInversionDe(this,monto);
    }
}

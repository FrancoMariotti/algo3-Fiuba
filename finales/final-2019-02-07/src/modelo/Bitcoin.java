package modelo;

public class Bitcoin implements Inversion{

    private int modificar(int monto) {
        return monto * 4;
    }

    @Override
    public int recibirInversionDe(InversionistaConservador inversionista, int monto) {
        return monto;
    }

    @Override
    public int recibirInversionDe(InversionistaAgresivo inversionista, int monto) {
        return modificar(monto);
    }

    @Override
    public int recibirInversionDe(InversionistaArriesgado inversionista, int monto) {
        return monto;
    }
}

package ar.uba.fi.algo3.modelo;

public class FamiliaConDosHermanos implements Deudor{
    @Override
    public double deuda(double cuotaAlumno, double cuotaMascotas) {
        return cuotaAlumno * 1.75;
    }
}

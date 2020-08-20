package ar.uba.fi.algo3.modelo;

import java.util.List;

public class FamiliaConMasDeTresHermanos implements Deudor {
    private List<Alumno> integrantes;

    public FamiliaConMasDeTresHermanos(List<Alumno> integrantes) {
        if(integrantes.size() < 4) {
            //throw CantidadDeHermanosMenorATresException();
        }
        this.integrantes = integrantes;
    }

    @Override
    public double deuda(double cuotaAlumno, double cuotaMascotas) {
        double deuda = 0.0;

        for (Alumno alumno : integrantes) {
            deuda += alumno.deuda(cuotaAlumno,cuotaMascotas);
        }

        return deuda;
    }
}

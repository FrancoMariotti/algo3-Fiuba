package ar.uba.fi.algo3.modelo;

import java.util.LinkedList;
import java.util.List;

public class Colegio {
    private double cuotaAlumnos;
    private double cuotaMascotas;
    private List<Deudor> deudores;
    private List<Mascota> mascotas;


    public Colegio(double cuotaAlumnos,double cuotaMascotas) {
        this.cuotaAlumnos = cuotaAlumnos;
        this.cuotaMascotas = cuotaMascotas;
        this.deudores = new LinkedList<>();
        this.mascotas = new LinkedList<>();

    }

    public void anotar(Deudor deudor) {
        this.deudores.add(deudor);
    }

    public void anotar(Mascota mascota) {
        this.deudores.add(mascota);
        this.mascotas.add(mascota);
    }

    public Double deudaAcumulada() {
        Double result = 0.0;

        for (Deudor deudor: this.deudores) {
            result += deudor.deuda(cuotaAlumnos,cuotaMascotas);
        }

        return result;
    }

    public int mordidas() {
        int mordidas = 0;

        for (Mascota mascota: mascotas) {
            mordidas += mascota.sumarMordida(mordidas);
        }

        return mordidas;
    }
}

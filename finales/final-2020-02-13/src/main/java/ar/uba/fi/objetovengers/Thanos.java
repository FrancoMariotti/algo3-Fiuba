package ar.uba.fi.objetovengers;

public class Thanos {
    private double puntosDeVida;
    private double puntosDeAtaque;
    private EstadoGemas estadoGemas;

    public Thanos() {
        this.puntosDeVida = 250;
        this.puntosDeAtaque = 15;
        this.estadoGemas = new NoTieneGemas();
    }

    public double getPuntosDeVida() {
        return this.puntosDeVida;
    }

    public void recibirDanio(double danio) {
        this.puntosDeVida -= danio;
    }

    public void atacar(Atacable enemigo) {
        double puntosDeAtaque = estadoGemas.modificarAtaque(this.puntosDeAtaque);
        enemigo.recibirDanio(puntosDeAtaque);
    }

    public void conseguirLasGemasDelInfinito() {
        this.estadoGemas = new TieneGemas();
    }
}

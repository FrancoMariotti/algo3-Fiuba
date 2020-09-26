public class WarMachine extends Armadura {
	private double puntosDeAtaque;
	private double puntosDeCuracion;

	public WarMachine() {
		this.puntosDeAtaque = 10;
		this.puntosDeCuracion = 10;
	}

	@Override
	public void atacar(Atacable atacable) {
		atacable.recibirDanio(this.puntosDeAtaque);
	}

	@Override
	public void curar(Curable curable) {
		curable.curar(this.puntosDeCuracion);
	}
}

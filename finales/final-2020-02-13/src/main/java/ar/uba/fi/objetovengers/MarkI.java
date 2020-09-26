public class MarkI extends Armadura {
	private double puntosDeAtaque;

	public MarkI() {
		this.puntosDeAtaque = 10;
	}

	@Override
	public void atacar(Atacable atacable) {
		atacable.recibirDanio(10);
	}
}
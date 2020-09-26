public class MarkII extends Armadura {
	private double puntosDeAtaque;

	public MarkII() {
		this.puntosDeAtaque = 12;
	}

	@Override
	public void atacar(Atacable atacable) {
		atacable.recibirDanio(puntosDeAtaque);
	}
}
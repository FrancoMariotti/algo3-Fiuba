package modelo.aves;

import modelo.acciones.Corredor;
import modelo.Superficies.Barro;
import modelo.Superficies.Hielo;
import modelo.Superficies.PistaDeAtletismo;
import modelo.Superficies.Superficie;

public class Avestruz implements Corredor {

	@Override
	public int correrEn(Superficie superficie) {
		return superficie.afectarVelocidadDe(this);
	}

	@Override
	public int correrEn(PistaDeAtletismo pistaDeAtletismo) {
		return 70;
	}

	@Override
	public int correrEn(Hielo hielo) {
		return 0;
	}

	@Override
	public int correrEn(Barro barro) {
		return 70;
	}
}

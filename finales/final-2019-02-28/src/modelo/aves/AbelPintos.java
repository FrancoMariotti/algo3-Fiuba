package modelo.aves;

import modelo.acciones.Cantante;
import modelo.acciones.Corredor;
import modelo.Superficies.Barro;
import modelo.Superficies.Hielo;
import modelo.Superficies.PistaDeAtletismo;
import modelo.Superficies.Superficie;

public class AbelPintos implements Cantante, Corredor {
	@Override
	public String cantar() {
		return "vas a entrar sin pedirme la llave...";
	}

	@Override
	public int correrEn(Superficie superficie) {
		return superficie.afectarVelocidadDe(this);
	}

	@Override
	public int correrEn(PistaDeAtletismo pistaDeAtletismo) {
		return 15;
	}

	@Override
	public int correrEn(Hielo hielo) {
		return 0;
	}

	@Override
	public int correrEn(Barro barro) {
		return 2;
	}
}

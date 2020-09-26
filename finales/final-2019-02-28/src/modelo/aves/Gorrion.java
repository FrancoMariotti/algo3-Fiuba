package modelo.aves;

import modelo.acciones.Cantante;
import modelo.acciones.Volador;

public class Gorrion implements Cantante, Volador {
	@Override
	public String cantar() {
		return "pio pio";
	}

	@Override
	public int volar() {
		return 50;
	}

}

import static org.junit.Assert.*;

import instrumentos.*;
import org.junit.Test;
import musicos.Musico;
import musicos.LucianoPereyra;

public class MusicosTest {

	@Test
	public void test00MusicoLucianoPereyraTocaElCharangoDePlasticoYElSonidoEsDe10Decibeles() {
		Musico lucianoPereyra = new LucianoPereyra();
		Instrumento charango = new CharangoDePlastico();

		assertEquals(lucianoPereyra.tocar(charango), 10);
	}

	@Test
	public void test01MusicoLucianoPereyraTocaElCharangoDeMaderaYElSonidoEsDe20Decibeles() {
		Musico lucianoPereyra = new LucianoPereyra();
		Instrumento charango = new CharangoDeMadera();

		assertEquals(lucianoPereyra.tocar(charango), 20);
	}

	@Test
	public void test02MusicoLucianoPereyraNoSabeTocarOtroInstrumentoYElSonidoEsDe0Decibeles() {
		Musico lucianoPereyra = new LucianoPereyra();
		Instrumento piano = new PianoDeMadera();
		Instrumento guitarra = new GuitarraCriollaDePlastico();

		assertEquals(lucianoPereyra.tocar(guitarra), 0);
		assertEquals(lucianoPereyra.tocar(piano), 0);
	}
	
	@Test
	public void test_BIEN_BIEN_COMPLETO(){
		
		/*LucianoPereyra lucianoPereyra = new LucianoPereyra();
		FitoPaez fitoPaez = new FitoPaez();
		RicardoMollo ricardoMollo = new RicardoMollo();
		
		assertEquals(lucianoPereyra.tocar(new Charango()), 20);	
		assertEquals(lucianoPereyra.tocar(new GuitarraCriolla()), 0);
		assertEquals(lucianoPereyra.tocar(new Piano()), 0);
		
		assertEquals(fitoPaez.tocar(new Charango()), 0);	
		assertEquals(fitoPaez.tocar(new GuitarraCriolla()), 0);
		assertEquals(fitoPaez.tocar(new Piano()), 150);
		
		assertEquals(ricardoMollo.tocar(new Charango()), 0);	
		assertEquals(ricardoMollo.tocar(new GuitarraCriolla()), 20);
		assertEquals(ricardoMollo.tocar(new Piano()), 0);
		
		
		Charango charangoDePlastico = new Charango();

		GuitarraCriolla guitarraDePlastico = new GuitarraCriolla();

		Piano pianoDePlastico = new Piano();

		assertEquals(lucianoPereyra.tocar(charangoDePlastico), 10);	
		assertEquals(lucianoPereyra.tocar(guitarraDePlastico), 0);
		assertEquals(lucianoPereyra.tocar(pianoDePlastico), 0);
		
		assertEquals(fitoPaez.tocar(charangoDePlastico), 0);	
		assertEquals(fitoPaez.tocar(guitarraDePlastico), 0);
		assertEquals(fitoPaez.tocar(pianoDePlastico), 45);
		
		assertEquals(ricardoMollo.tocar(charangoDePlastico), 0);	
		assertEquals(ricardoMollo.tocar(guitarraDePlastico), 17);
		assertEquals(ricardoMollo.tocar(pianoDePlastico), 0);*/

	}

}

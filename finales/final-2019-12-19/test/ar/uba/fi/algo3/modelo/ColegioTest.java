package ar.uba.fi.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ColegioTest {

	@Test
    public void test00colegioConCuatroAlumnosNoHermanosLaDeudaAcumuladaEsDe400Pesos() {
	    //Arrange
        Colegio nacional = new Colegio(100.0,150.0);
        Deudor alumno1 = new Alumno();
        Deudor alumno2 = new Alumno();
        Deudor alumno3 = new Alumno();
        Deudor alumno4 = new Alumno();

        //Act
        nacional.anotar(alumno1);
        nacional.anotar(alumno2);
        nacional.anotar(alumno3);
        nacional.anotar(alumno4);

        assertEquals(400, nacional.deudaAcumulada());
    }
	
    @Test
    public void test01colegioConDosAlumnosHermanosLaDeudaAcumuladaEsDe175Pesos() {
        Colegio nacional = new Colegio(100.0,150.0);
        Deudor familia = new FamiliaConDosHermanos();

        nacional.anotar(familia);

        // Cuando hay dos hermanos, uno de ellos paga 25% menos
        assertEquals(175, nacional.deudaAcumulada());
    }

    @Test
    public void test02colegioConTresAlumnosHermanosLaDeudaAcumuladaEsDe200Pesos() {
	    //Arrange
        Colegio nacional = new Colegio(100.0,150.0);
        Deudor familia = new FamiliaConTresHermanos();
       //Act
        nacional.anotar(familia);

        //Assert
        // Cuando hay tres hermanos, uno de ellos no paga
        assertEquals(200, nacional.deudaAcumulada());
    }

    @Test
    public void test03colegioConMascotaQueNoMordioYSinAlumnosLaDeudaAcumuladaEsDe150Pesos() {
        //Arrange
        Colegio nacional = new Colegio(0,150.0);
        Deudor mascota = new Mascota();
        //Act
        nacional.anotar(mascota);

        //Assert
        assertEquals(150, nacional.deudaAcumulada());
    }

    @Test
    public void test04colegioConMascotaQueMordioYSinAlumnosLaDeudaAcumuladaEsDe300Pesos() {
        //Arrange
        Colegio nacional = new Colegio(0,150.0);
        Mascota mascota = new Mascota();
        Deudor deudor = mascota;

        //Act
        nacional.anotar(deudor);
        mascota.morder();

        //Assert
        assertEquals(300, nacional.deudaAcumulada());
    }

    @Test
    public void test05colegioConMascotaQueMordioLaCantidadDeMordidasEsUno() {
        //Arrange
        Colegio nacional = new Colegio(100,150.0);
        Mascota mascota = new Mascota();

        //Act
        nacional.anotar(mascota);
        mascota.morder();

        //Assert
        assertEquals(1, nacional.mordidas());
    }


    
}

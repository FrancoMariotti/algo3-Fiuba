import modelo.Superficies.Barro;
import modelo.Superficies.Hielo;
import modelo.Superficies.PistaDeAtletismo;
import modelo.Superficies.Superficie;
import modelo.acciones.Corredor;
import modelo.aves.AbelPintos;
import modelo.aves.Avestruz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CorredorTests {
    @Test
    public void test00CorredorAvestruzCorreSobreSuperficiePistaDeAtletismoAVelocidad70KilometrosporHora(){
        Corredor avestruz = new Avestruz();
        Superficie pistaDeAtletismo = new PistaDeAtletismo();
        assertEquals(avestruz.correrEn(pistaDeAtletismo),70);
    }

    @Test
    public void test01CorredorAvestruzNoPuedeCorreSobreSuperficieHielo(){
        Corredor avestruz = new Avestruz();
        Superficie hielo = new Hielo();
        assertEquals(avestruz.correrEn(hielo),0);
    }

    @Test
    public void test02CorredorAvestruzCorreSobreSuperficieBarroAVelocidad70KilometrosporHora() {
        Corredor aveztruz = new Avestruz();
        Superficie barro = new Barro();
        assertEquals(aveztruz.correrEn(barro), 70);
    }

    @Test
    public void test03CorredorAbelPintosCorreSobreSuperficiePistaDeAtletismoAVelocidad15KilometrosporHora() {
        Corredor abelpintos = new AbelPintos();
        Superficie pistaDeAtletismo = new PistaDeAtletismo();
        assertEquals(abelpintos.correrEn(pistaDeAtletismo), 15);
    }

    @Test
    public void test04CorredorAbelPintosNopuedeCorrerSobreHielo() {
        Corredor abelpintos = new AbelPintos();
        Superficie hielo = new Hielo();
        assertEquals(abelpintos.correrEn(hielo), 0);
    }

    @Test
    public void test05CorredorAbelPintosCorreSobreSuperficieBarroAVelocidad2KilometrosporHora() {
        Corredor abelpintos = new AbelPintos();
        Superficie barro = new Barro();
        assertEquals(abelpintos.correrEn(barro), 2);
    }
}
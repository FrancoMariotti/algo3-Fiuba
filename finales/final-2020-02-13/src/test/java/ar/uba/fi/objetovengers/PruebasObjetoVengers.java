package ar.uba.fi.objetovengers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PruebasObjetoVengers {

    private static final double DELTA = 1e-12;

    @Test
    public void test01ThanosEmpiezaSiempreCon250PuntosDeVida() {
        Thanos thanos = new Thanos();

        assertEquals(250, thanos.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test02IronManEmpiezaSiempreCon100PuntosDeVida() {
        IronMan ironMan1 = new IronMan(new MarkI());
        IronMan ironMan2 = new IronMan(new MarkII());
        IronMan ironMan3 = new IronMan(new WarMachine());

        assertEquals(100, ironMan1.getPuntosDeVida(), DELTA);
        assertEquals(100, ironMan2.getPuntosDeVida(), DELTA);
        assertEquals(100, ironMan3.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test03ThanosAtacaAIronManYLeQuita15PuntosDeVida() {
        Thanos thanos = new Thanos();
        IronMan ironMan = new IronMan(new MarkI());

        thanos.atacar(ironMan);

        assertEquals(85, ironMan.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test04IronManConArmaduraMarkIQuita10PuntosDeVidaAThanos() {
        IronMan ironMan = new IronMan(new MarkI());
        Thanos thanos = new Thanos();

        ironMan.atacar(thanos);

        assertEquals(240, thanos.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test05IronManConArmaduraMarkIIQuita12PuntosDeSuVidaAThanos() {
        IronMan ironMan = new IronMan(new MarkII());
        Thanos thanos = new Thanos();

        ironMan.atacar(thanos); 

        assertEquals(238, thanos.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test06IronManConArmaduraWarMachineAtacaAThanosYLeRoba10PuntosDeVida() {
        IronMan ironMan = new IronMan(new WarMachine());
        Thanos thanos = new Thanos();

        ironMan.atacar(thanos);

        assertEquals(240, thanos.getPuntosDeVida(), DELTA);
        assertEquals(110, ironMan.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test07IronManConArmaduraMarkISePoneArmaduraMarkIIYAtacaAThanos() {
        IronMan ironMan = new IronMan(new MarkI());
        Thanos thanos = new Thanos();
        ironMan.agregarArmadura(new MarkII());
        
        ironMan.atacar(thanos);

        assertEquals(218, thanos.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test08IronManConArmaduraMarkISePoneArmaduraWarMachineYAtacaAThanos() {
        IronMan ironMan = new IronMan(new MarkI());
        Thanos thanos = new Thanos();

        ironMan.agregarArmadura(new WarMachine());

        // Le quita los 10 de MarkI y otros 10 mas por tener WarMachine. Ademas absorbe 10 puntos
        ironMan.atacar(thanos);

        assertEquals(220, thanos.getPuntosDeVida(), DELTA);
        assertEquals(110, ironMan.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test09IronManConArmaduraMarkIISePoneLasOtrasArmadurasYAtacaAThanos() {
        IronMan ironMan = new IronMan(new MarkII());
        Thanos thanos = new Thanos();


        ironMan.agregarArmadura(new MarkI());
        ironMan.agregarArmadura(new WarMachine());

        // Le quita los 12 de MarkII, 10 de MarkI y otros 10 de WarMachine. Absorbe 10 puntos.
        ironMan.atacar(thanos);

        assertEquals(218, thanos.getPuntosDeVida(), DELTA);
        assertEquals(110, ironMan.getPuntosDeVida(), DELTA);
    }


    @Test
    public void test11ThanosConsigueLasGemasDelInfinitoYAtacaConElCuadrupleDePoder() {
        Thanos thanos = new Thanos();
        IronMan ironMan = new IronMan(new MarkI());

        thanos.conseguirLasGemasDelInfinito();

        thanos.atacar(ironMan); // ataca con 60

        assertEquals(40, ironMan.getPuntosDeVida(), DELTA);
    }

}

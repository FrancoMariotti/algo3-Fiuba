public class IronMan implements Atacable,Curable {
	private double puntosDeVida;
	private List<Armadura> armaduras;

	public IronMan(Armadura armadura) {
		this.puntosDeVida = 100;
		armaduras = new ArrayList<>();
		armaduras.add(armadura);
	}

	public void agregarArmadura(Armadura armadura) {
		armaduras.add(armadura);
	}

    public void atacar(Atacable enemigo) {
        for(Armadura armadura: armaduras) {
            armadura.atacar(enemigo);
            armadura.curar(this);
        }
    }

	@Override
    public void recibirDanio(double danio) {
        this.puntosDeVida -= danio;
    }

    @Override
    public void curar(double puntosDeCuracion) {
    	this.puntosDeVida += puntosDeCuracion;
    }

	public double getPuntosDeVida() {
        return this.puntosDeVida;
    }
}
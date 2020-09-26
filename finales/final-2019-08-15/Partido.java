public class Partido {
    private List<String> leyendas;
    private int votos;

    public Partido(String nombre) {
        this.leyendas = new ArrayList<String>();
        this.leyendas.add(nombre);
        this.votos = 0;
    }

    public void agregarLeyenda(String leyenda) {
        leyenda.add(leyenda);
    }

    public boolean teLLamas(String leyenda) {
        return leyendas.contains(leyenda);
    }

    public void votar(int cantidadVotos) {
        votos += cantidadVotos;
    }

    public int escrutar() {
        return votos;
    }

    public void resetear() {
        this.votos = 0;
    }
}
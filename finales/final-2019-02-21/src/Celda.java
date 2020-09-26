public class Celda {
    private Letra letra;
    private EstadoCelda estadoCelda;

    public Celda(Letra letra) {
        this.letra = letra;
        this.estadoCelda = new NoContabilizada();
    }

    public int getPesoLetra() {
        int resultado = estadoCelda.contar(letra);
        estadoCelda = new Contabilizada();
        return resultado;
    }
}

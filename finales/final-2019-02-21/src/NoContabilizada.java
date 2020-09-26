public class NoContabilizada implements EstadoCelda {
    @Override
    public int contar(Letra letra) {
        return letra.getPeso();
    }
}

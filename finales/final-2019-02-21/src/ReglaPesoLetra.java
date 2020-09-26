public class ReglaPesoLetra implements Regla {
    @Override
    public boolean validar(String letra, int peso) {
        if(peso < 0) throw new PesoNegativoException();
        return true;
    }
}

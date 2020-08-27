public class ReglaLongitudLetra implements Regla{
    @Override
    public boolean validar(String letra, int peso) {
        if(letra.length() != 1) throw new LongitudLetraException();

        return true;
    }
}

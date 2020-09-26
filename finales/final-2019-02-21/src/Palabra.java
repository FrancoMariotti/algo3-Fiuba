import java.util.ArrayList;
import java.util.List;

public class Palabra {
    private List<Celda> celdas;

    public Palabra() {
    	this.celdas = new ArrayList<Celda>();
    }

    public int puntaje() {
        int puntaje = 0;
        for (Celda celda : this.celdas) {
    		puntaje += celda.getPesoLetra();
        }

        return puntaje;
    }

    public void agregarCelda(Celda celda) {
        celdas.add(celda);
    }
}
 

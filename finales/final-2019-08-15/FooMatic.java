public class FooMatic {
    private List<Partido> partidos;

    public void agregarPartido(Partido partido) {
        partidos.add(partido);
    }

    public void votar(String leyenda) {
        votar(leyenda,1);
    }


    public void votar(String leyenda,int cantidadVotos) {
        Partido partido = buscarPartido(leyenda);
        partido.votar(cantidadVotos);
    }

    private Partido buscarPartido(String leyenda) {
        for(Partido partido: partidos) {
            if(partido.teLLamas(leyenda))
                return partido;
        }

        throw new PartidoInexistenteException();
    }

    public int escrutinio(String leyenda) {
        Partido partido = buscarPartido(leyenda);
        return partido.escrutar();
    }
}
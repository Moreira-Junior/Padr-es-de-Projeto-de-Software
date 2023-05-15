package iterator;

import grafo.dirigido.Aresta;
import grafo.dirigido.Vertice;

import java.util.*;

public class BFSIterator<T> implements IteratorInterface{

    private List<Vertice<T>> vertices;
    private List<Aresta<T>> arestas;
    private Queue<Vertice<T>> fila = new LinkedList<>();
    private Set<Vertice<T>> visitados = new HashSet<>();

    public BFSIterator(List<Vertice<T>> vertices, List<Aresta<T>> arestas, T carga) {
        this.arestas = arestas;
        this.vertices = vertices;
        if(getVertice(carga) != null){
            this.fila.add(getVertice(carga));
            this.visitados.add(getVertice(carga));
        } else {
            throw new NoSuchElementException();
        }

    }
    @Override
    public boolean hasNext() {
        return !fila.isEmpty();
    }

    @Override
    public Vertice<T> next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Vertice<T> proximo = fila.remove();
        for (Vertice<T> vizinho : this.incidentes(proximo)){
            if(!this.visitados.contains(vizinho)){
                this.fila.add(vizinho);
                this.visitados.add(vizinho);
            }
        }
        return proximo;
    }

    private Vertice<T> getVertice(T carga){

        for (Vertice<T> u : vertices) {
            if ( u.getCarga().equals( carga ))
                return u;
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    private List<Vertice<T>> incidentes( Vertice<T> u ){
        List<Vertice<T>> vertex = new ArrayList<Vertice<T>>();
        for(Aresta<T> arco: arestas){
            if( arco.getOrigem().equals(u))
                vertex.add((Vertice<T>) arco.getDestino());
        }
        return vertex;
    }
}
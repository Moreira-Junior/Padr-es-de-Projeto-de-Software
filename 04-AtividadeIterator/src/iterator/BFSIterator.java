package iterator;

import grafo.dirigido.Aresta;
import grafo.dirigido.VertexState;
import grafo.dirigido.Vertice;

import java.util.*;

public class BFSIterator<T> implements IteratorInterface{

    private List<Vertice<T>> vertices;
    private List<Aresta<T>> arestas;
    private Queue<Vertice<T>> fila;
    private Vertice<T> ultimoVertice;

    public BFSIterator(List<Vertice<T>> vertices, List<Aresta<T>> arestas, T carga) {
        this.vertices = vertices;
        this.arestas = arestas;
        this.fila = new LinkedList<>();
        this.BFS(carga);
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
        ultimoVertice = fila.remove();
        return ultimoVertice;
    }

    private Vertice<T> getVertice(T carga){

        for (Vertice<T> u : vertices) {
            if ( u.getCarga().equals( carga ))
                return u;
        }
        return null;
    }

    private boolean exists(Vertice<T> v){

        for (Vertice<T> u : vertices) {
            if ( u.getCarga().equals( v.getCarga() ) )
                return true;
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    private List<Vertice<T>> incidentes( Vertice<T> u ){
        List<Vertice<T>> vertex = new ArrayList<Vertice<T>>();
        for(Aresta<T> arco: arestas){
            if( arco.getDestino().equals(u))
                vertex.add((Vertice<T>) arco.getOrigem());
            else if( arco.getOrigem().equals(u))
                vertex.add((Vertice<T>) arco.getDestino());

        }
        return vertex;
    }

    private void BFS( T source ){
        Queue<Vertice<T>> q = new LinkedList<Vertice<T>>();
        List<Vertice<T>> uAdjacentes = null;

        Vertice<T> v = getVertice(source);

        if( !exists( v) )
            return;
        // Marcando todos os n�s como NAO-VISITADOS
        for(int i=0; i < vertices.size(); i++ ){
            vertices.get(i).setStatus(VertexState.Unvisited);
        }

        v.setStatus(VertexState.Visited);
        q.add(v);

        while ( !q.isEmpty()){
            Vertice<T> u = q.remove();
//            adicionarNaFila(u);
            uAdjacentes = incidentes(u);

            for(Vertice<T> w: uAdjacentes){
                if( w.getStatus() == VertexState.Unvisited ) {
                    w.setStatus(VertexState.Visited);
//                    adicionarNaFila(w);
                    q.add(w);
                }
            }
            adicionarNaFila(u);
            u.setStatus(VertexState.Finished);
        }
    }

    private void adicionarNaFila(Vertice<T> carga){
        if(!this.fila.contains(carga)){
            this.fila.add(carga);
        }
    }
}

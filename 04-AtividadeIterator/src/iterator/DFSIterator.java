package iterator;

import grafo.dirigido.Aresta;
import grafo.dirigido.VertexState;
import grafo.dirigido.Vertice;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

public class DFSIterator<T> implements IteratorInterface{

    private List<Vertice<T>> vertices;
    private List<Aresta<T>> arestas;
    private Queue<Vertice<T>> fila;
    private Vertice<T> ultimoVertice;

    public DFSIterator(List<Vertice<T>> vertices, List<Aresta<T>> arestas, T carga) {
        this.vertices = vertices;
        this.arestas = arestas;
        this.fila = new LinkedList<>();
        this.DFS(carga);
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

    public void DFS(T source){
        Vertice<T> u = null;

        if ((u = getVertice(source)) == null) {
            System.err.println("vertice nao encontrado em runDFS()");
            return;
        }

        for(int i=0; i < vertices.size(); i++ ){
            vertices.get(i).setStatus(VertexState.Unvisited);
        }

        runDFS( u );

    }

    @SuppressWarnings("unchecked")
    private void runDFS(Vertice<T> u){
        Vertice<T> w = null;
        List<Aresta<T>> uAdjacentes = null;

        u.setStatus(VertexState.Visited);
        uAdjacentes = u.getAdj();

        for(Aresta<T> arco: uAdjacentes){
            w = (Vertice<T>) arco.getDestino();
            if( w.getStatus() == VertexState.Unvisited )
                runDFS(w);
        }
        adicionarNaFila(u);
        u.setStatus(VertexState.Finished);
    }

    public Vertice<T> getVertice( T carga){

        for (Vertice<T> u : vertices) {
            if ( u.getCarga().equals( carga ))
                return u;
        }
        return null;
    }

    public void adicionarNaFila(Vertice<T> carga) {
        if (!this.fila.contains(carga)) {
            this.fila.add(carga);
        }
    }
}

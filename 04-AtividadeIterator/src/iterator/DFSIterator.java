package iterator;

import grafo.dirigido.Aresta;
import grafo.dirigido.Vertice;

import java.util.*;

public class DFSIterator<T> implements IteratorInterface{

    private List<Vertice<T>> vertices;
    private List<Aresta<T>> arestas;
    private Stack<Vertice<T>> pilha = new Stack<>();
    private Set<Vertice<T>> visitados = new HashSet<>();

    public DFSIterator(List<Vertice<T>> vertices, List<Aresta<T>> arestas, T carga) {
        this.vertices = vertices;
        this.arestas = arestas;
        Vertice<T> origem = getVertice(carga);
        if (origem != null) {
            this.pilha.push(origem);
            this.visitados.add(origem);
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public boolean hasNext() {
        return !pilha.isEmpty();
    }

    @Override
    public Vertice<T> next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Vertice<T> atual = pilha.pop();
        for (Vertice<T> vizinho : this.adjacentes(atual)) {
            if (!this.visitados.contains(vizinho)) {
                this.pilha.push(vizinho);
                this.visitados.add(vizinho);
            }
        }
        return atual;
    }

    public Vertice<T> getVertice( T carga){

        for (Vertice<T> u : vertices) {
            if ( u.getCarga().equals( carga ))
                return u;
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    private List<Vertice<T>> adjacentes(Vertice<T> u) {
        List<Vertice<T>> vertex = new ArrayList<>();
        for (Aresta<T> arco : arestas) {
            if (arco.getOrigem().equals(u)) {
                vertex.add((Vertice<T>) arco.getDestino());
            }
        }
        return vertex;
    }
}

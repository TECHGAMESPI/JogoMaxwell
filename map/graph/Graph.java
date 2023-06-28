package map.graph;

import map.lista.ArrayList;
import map.city.City;

public class Graph {

    // Listas para armazenar os vertices e nós;
    
    private ArrayList<Vertice> vertices = new ArrayList<>();
    private ArrayList<Aresta> arestas = new ArrayList<Aresta>();

    // Methods;

    public void insertVertice (City city) {
        Vertice node = new Vertice(city);
        this.vertices.add(node);
    }

    public void inserAresta (int cost, City start, City end) {
        Vertice inicio = this.get(start);
        Vertice fim = this.get(end);

        Aresta aresta1 = new Aresta(cost, inicio, fim);
        inicio.setSaida(aresta1);
        fim.setEntrada(aresta1);

        this.arestas.add(aresta1);

        Aresta aresta2 = new Aresta(cost, fim, inicio);
        fim.setSaida(aresta2);
        inicio.setEntrada(aresta2);

        this.arestas.add(aresta2);
    }

    public Vertice get (City city) {
        Vertice assistant = null;

        for (int c = 1; c < this.vertices.getSize() + 1; c++) {
            if (vertices.get(c).getCity() == city) {
                assistant = vertices.get(c);
            }
        }

        return assistant;
    }

}

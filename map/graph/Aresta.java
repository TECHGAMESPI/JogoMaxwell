package map.graph;

public class Aresta {
    // Atributos;

    private int cost;
    private Vertice start;
    private Vertice end;

    // Getters;

    public Aresta(int cost, Vertice start, Vertice end) {
        this.cost = cost;
        this.start = start;
        this.end = end;
    }

    // Getters

    public int getCost() {
        return cost;
    }

    public Vertice getStart() {
        return start;
    }

    public Vertice getEnd() {
        return end;
    }
}

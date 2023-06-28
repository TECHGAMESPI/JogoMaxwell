package map.graph;

import map.city.City;
import map.lista.ArrayList;

public class Vertice {
    // Atributos e listas de entrada e saida;

    private City city;
    private ArrayList<Aresta> entrada = new ArrayList<Aresta>();
    private ArrayList<Aresta> saida = new ArrayList<Aresta>();

    // Constructor;

    public Vertice (City city) {
        this.city = city;
    }

    // Getters;

    public City getCity () {
        return this.city;
    }

    public int getSizeSaida () {
        return this.saida.getSize();
    }

    // Setters;

    public void setEntrada (Aresta aresta) {
        this.entrada.add(aresta);
    }

    public void setSaida (Aresta aresta) {
        this.saida.add(aresta);
    }

    // Methods

    public Vertice getListCity (int position) {
        return this.saida.get(position).getEnd();
    }

}

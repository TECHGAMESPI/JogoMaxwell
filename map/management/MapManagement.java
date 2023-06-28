package map.management;

import map.city.*;
import map.graph.*;

public class MapManagement {

    Mission mission = new Mission ();


    Graph map = new Graph();
    
    // Kingdom cities;

    City ubud = new City("Ubud", 0, null);
    City kingdom_of_legmod = new City("Kingdom of Legmod", 2, null);
    City principality_of_nekika = new City("Principality of Nekika", 1, null);
    City principality_of_gritestar = new City("Principality of Gritestar", 5, null);
    City protectorate_of_dogrove = new City("Protectorate of Dogrove", 3, null);
    City kingdom_of_lastwatch = new City("Kingdom of Lastwatch", -2, null);
    City grand_duchy_of_smalia = new City("Grand Duchy of Smalia", 1, null);
    City kingdom_of_oldcalia = new City("Kingdom of Oldcalia", 4, null);
    City kingdom_of_kalb  = new City("Kingdom of Kalb", 2, mission);
    City aymar_league = new City("Aymar League", 1, null);
    City defalsia  = new City("Defalsia", -3, mission);
    City vunese_of_empire = new City("Vunese of Empire", 0, mission);
    City principality_of_karhora = new City("Principality of Karhora", -2, null);
    City chandir_sultanate = new City("Chandir Sultanate", 1, null);
    City bun  = new City("Bun", 5, null);
    City principality_of_kasya = new City("Principality of Kasya", -7, null);
    City nargumun = new City("Nargumun", 0, null);

    private Vertice currentCity;
    int opc;
   
    // implementacao das cidades no grafo;

    public MapManagement () {
       
        // Inserindo cidades nos vertices do grafo;

        map.insertVertice(ubud);
        map.insertVertice(kingdom_of_legmod);
        map.insertVertice(principality_of_nekika);
        map.insertVertice(principality_of_gritestar);
        map.insertVertice(protectorate_of_dogrove);
        map.insertVertice(kingdom_of_lastwatch);
        map.insertVertice(grand_duchy_of_smalia);
        map.insertVertice(kingdom_of_oldcalia);
        map.insertVertice(kingdom_of_kalb);
        map.insertVertice(aymar_league);
        map.insertVertice(defalsia);
        map.insertVertice(vunese_of_empire);
        map.insertVertice(principality_of_karhora);
        map.insertVertice(chandir_sultanate);
        map.insertVertice(bun);
        map.insertVertice(principality_of_kasya);
        map.insertVertice(nargumun);

        // Inserindo arestas entre as cidades;

        map.inserAresta(0, ubud, kingdom_of_legmod);
        map.inserAresta(0, ubud, principality_of_nekika);
        map.inserAresta(0, principality_of_nekika, principality_of_gritestar);
        map.inserAresta(0, kingdom_of_legmod, protectorate_of_dogrove);
        map.inserAresta(0, principality_of_nekika, kingdom_of_legmod);
        map.inserAresta(0, kingdom_of_legmod, principality_of_gritestar);
        map.inserAresta(0, kingdom_of_legmod, kingdom_of_oldcalia);
        map.inserAresta(0, principality_of_gritestar, protectorate_of_dogrove);
        map.inserAresta(0, principality_of_gritestar, kingdom_of_lastwatch);
        map.inserAresta(0, protectorate_of_dogrove, kingdom_of_lastwatch);
        map.inserAresta(0, protectorate_of_dogrove, grand_duchy_of_smalia);
        map.inserAresta(0, protectorate_of_dogrove, kingdom_of_oldcalia);
        map.inserAresta(0, kingdom_of_lastwatch, grand_duchy_of_smalia);
        map.inserAresta(0, grand_duchy_of_smalia, kingdom_of_oldcalia);
        map.inserAresta(0, kingdom_of_oldcalia, kingdom_of_kalb);
        map.inserAresta(0, kingdom_of_oldcalia, defalsia);
        map.inserAresta(0, kingdom_of_oldcalia, aymar_league);
        map.inserAresta(0, defalsia, aymar_league);
        map.inserAresta(0, kingdom_of_kalb, aymar_league);
        map.inserAresta(0, kingdom_of_kalb, vunese_of_empire);
        map.inserAresta(0, aymar_league, principality_of_karhora);
        map.inserAresta(0, aymar_league, vunese_of_empire);
        map.inserAresta(0, aymar_league, nargumun);
        map.inserAresta(0, aymar_league, bun);
        map.inserAresta(0, aymar_league, chandir_sultanate);
        map.inserAresta(0, principality_of_karhora, nargumun);
        map.inserAresta(0, vunese_of_empire, chandir_sultanate);
        map.inserAresta(0, chandir_sultanate, principality_of_kasya);
        map.inserAresta(0, chandir_sultanate, bun);
        map.inserAresta(0, bun, nargumun);

        this.currentCity = map.get(ubud);
    }

    public Vertice getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(Vertice currentCity) {
        this.currentCity = currentCity;
    }

    
}

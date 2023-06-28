package map.city;

public class City {
    private String name;
    private int powerJewel;
    Mission mission;

    // Constructor

    public City (String name, int powerJewel, Mission mission) {
        this.name = name;
        this.powerJewel = powerJewel;
        this.mission = mission;
    }

    // Getters

    public String getName () {
        return this.name;
    }

    public int getPowerJewel () {
        return this.powerJewel;
    }

    public Mission getMission () {
        return this.mission;
    }

    // Setters 

}

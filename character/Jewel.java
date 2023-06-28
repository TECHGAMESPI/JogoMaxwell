package character;

public class Jewel {

    private int weightJewel;

    // Getters

    public int getWeightJewel() {
        return weightJewel;
    }

    // Setters

    public void setWeightJewel(int weightJewel) {
        this.weightJewel = weightJewel;

        if (this.weightJewel < 0) {
            this.weightJewel = 0;
        }
    } 
}
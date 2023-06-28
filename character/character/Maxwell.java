package character;

public class Maxwell {

    private int limiarJewel;
    private int coins;
    private boolean statusMission;

    // Constructor

    public Maxwell () {
        this.statusMission = false;
        this.limiarJewel = 7;
        this.coins = 4;
    }

    // getters

    public int getLimiarJewel() {
        return limiarJewel;
    }

    public int getCoins () {
        return this.coins;
    }

    public boolean getStatusMission () {
        return this.statusMission;
    }

    // Setters

    public void setLimiarJewel(int limiarJewel) {
        this.limiarJewel = limiarJewel;
    }

    public void setCoins (int coins) {
        this.coins = coins;
    } 

    public void setStatusMission (boolean statusMission) {
        this.statusMission = statusMission;
    }
}
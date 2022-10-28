package ch.bbw.cardgame;

/**
 * Car
 *    Fachklasse für ein Auto
 * @original_author Peter Rutschmann
 * @new_author Kenta Waibel
 * @original_creation_date 26.08.2021
 * @feature_date 23.09.2022
 *
 */
public class Car {
    private String imageUrl;
    private String tradeName;
    private String model;
    private double prize;
    private double velocity;
    private double chairs;
    private double doors;
    private double ps;

    public Car( String tradeName, String model, double prize, double velocity, double chairs, double doors, double ps) {;
        this.tradeName = tradeName;
        this.model = model;
        this.prize = prize;
        this.velocity = velocity;
        this.chairs = chairs;
        this.doors = doors;
        this.ps = ps;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public double getChairs() {
        return chairs;
    }

    public void setChairs(double chairs) {
        this.chairs = chairs;
    }

    public double getDoors() {
        return doors;
    }

    public void setDoors(double doors) {
        this.doors = doors;
    }

    public double getPs() {
        return ps;
    }

    public void setPs(double ps) {
        this.ps = ps;
    }
}

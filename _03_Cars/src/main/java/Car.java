/**
 * Car
 * @author Kenta
 * @version 16.09.2022
 */
public class Car {
    //Attributes
    private String model;
    private double velocity;

    public Car(String model, double velocity) {
        this.model = model;
        this.velocity = velocity;
    }
    public Car(){
        model = "unknown";
        velocity = 0;
    }

    public String getModel() {
        return model;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    @Override
    public String toString() {
        return "Car{" + "model=" + model + '\'' + ", velocity=" + velocity + '}';
    }
    public void accelerate() {
        System.out.println("Car.accelerate(): is called, but no implementation available");
    }
}






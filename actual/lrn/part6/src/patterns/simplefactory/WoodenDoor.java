package patterns.simplefactory;

public class WoodenDoor implements Door {

    private double height;
    private double weight;

    public WoodenDoor(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "WoodenDoor{" +
            "height=" + height +
            ", weight=" + weight +
            '}';
    }
}

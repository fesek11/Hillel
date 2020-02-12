package Task8;

public class Chair {
    private int legs;
    private String name;
    private double weight;

    public Chair() {
    }

    public Chair(int legs, String name, double weight) {
        this.legs = legs;
        this.name = name;
        this.weight = weight;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "legs=" + legs +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}

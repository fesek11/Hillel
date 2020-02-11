package Task8;

public class Chair {
    int legs = 4;
    String name = "Chair";
    double weight = 2.2;

    public Chair() {
    }

    public Chair(int legs, String name, double weight) {
        this.legs = legs;
        this.name = name;
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

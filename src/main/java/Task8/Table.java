package Task8;

public class Table {


    private int legs;
    private String name;
    private double weight;

    public Table() {
    }

    public Table(int legs, String name, double weight) {
        this.legs = legs;
        this.name = name;
        this.weight = weight;
    }

    private int getLegs() {
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
        return "Table{" +
                "legs=" + legs +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}

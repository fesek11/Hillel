package Task8;

public class Table {


    int legs = 3;
    String name = "Stol";
    double weight = 3.5;

    public Table() {
    }

    public Table(int legs, String name, double weight) {
        this.legs = legs;
        this.name = name;
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

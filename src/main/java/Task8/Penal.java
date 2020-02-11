package Task8;

public class Penal {
    int legs = 4;
    String name = "Penal";

    public Penal() {
    }

    public Penal(int legs, String name) {
        this.legs = legs;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Penal{" +
                "legs=" + legs +
                ", name='" + name + '\'' +
                '}';
    }
}

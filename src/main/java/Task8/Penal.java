package Task8;

public class Penal {
    private int legs;
    private String name;

    public Penal() {
    }

    public Penal(int legs, String name) {
        this.legs = legs;
        this.name = name;
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

    @Override
    public String toString() {
        return "Penal{" +
                "legs=" + legs +
                ", name='" + name + '\'' +
                '}';
    }
}

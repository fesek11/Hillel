package Task7;

public class Cat {
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
             //   ", age=" + age + //на случай если мне нужна будет инфа только по 1 параметру (name)
                //  ", weight=" + weight +
                '}';
    }

    String name;
    int age;
    double weight;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Cat() {

    }

    public void Cat(String name) {
        this.name = name;
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Cat(String name, int age, double weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

}

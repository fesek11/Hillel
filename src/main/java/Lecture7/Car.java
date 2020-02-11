package Lecture7;

public class Car {
    int id;
    String type;
    String color;
    int weight;
private     String number;

    public void setNumber(String number){
        this.number = number;
    }
    public String getNumber(String number){
       return "nothing";
    }

    public Car(int id) {
        this.id = id;
    }


    public Car() {

    }

    public Car(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public Car(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public Car(String type, String color, int weight) {
        this.type = type;
        this.color = color;
        this.weight = weight;
    }
    public Car(String type, int weight, String color) {
        this.type = type;
        this.color = color;
       // this.weight = weight; обращается к общей переменной в классе
        //weight. обращается к переменной в  конструкторе

    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}

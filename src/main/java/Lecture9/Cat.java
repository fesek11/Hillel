package Lecture9;

public class Cat extends Animal implements Functional {

    boolean seeInNight;
    public  void meow(){
        System.out.println("Meow in the cat");
    }

    public void seeInNight(boolean seeInNight) {
        this.seeInNight = seeInNight;
    }

    @Override
    public void run() {
        System.out.println("Cat run");
    }
}

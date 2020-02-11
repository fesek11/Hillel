package Task7;

public class Task1 {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Cat cat1 = new Cat("Vasya");
        Cat cat2 = new Cat(1,"Kot");
        Cat cat3 = new Cat("Kis", 12, 2.3);
        Dog dog = new Dog();
        Dog dog1 = new Dog("Doggy");
        Dog dog2 = new Dog(2,"Gav");
        Dog dog3 = new Dog("Pes", 4, 5.5);

        System.out.println(cat1.toString());
        System.out.println(dog3.toString());

        Cat catMethod = new Cat();
        catMethod.setName("Kit");
        System.out.println("Name: " + catMethod.getName());

        Dog dogMethod = new Dog();
        dogMethod.setWeight(4.123);
        System.out.println("dogMethod.getWeight() = " + dogMethod.getWeight());




    }


}

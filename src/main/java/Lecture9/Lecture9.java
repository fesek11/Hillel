package Lecture9;

public class Lecture9 {
    public static void main(String[] args) {
/*
      Animal animal =  new Animal();
      Cat cat = new Cat();
      Persian persian = new Persian();

      animal.say();
      cat.say();
      persian.say();

     // animal.meow();//этого метода нету
      cat.meow();
      persian.meow();

      cat.seeInNight(true);
      persian.seeInNight(true);
*/ // --------Пример динамической диспетчеризации--------
      Cat cat = new Cat();
      cat.seeInNight(true);
      Animal catAnimal = new Cat();
     // catAnimal.say();

      Dog dog = new Dog();
      Animal dogAnimal = new Dog();
//      dog.run();
//      dogAnimal.say();

//      dogChanges(dog, 4);
//
//      animalChanges(dog, 0);
//      animalChanges(cat, 1);

      instanceofExample(cat);
      instanceofExample(dog);
    }
    private static void dogChanges(Dog dog, int legs){
      if (legs == 4){
      dog.setLegs(legs);
      } else {
        System.out.println("Wrong value");
      }
      dog.say();
    }
    private static void catChanges(Cat cat, int legs){
        if (legs == 4){
            cat.setLegs(legs);
        } else {
            System.out.println("Wrong value");
        }
        cat.say();
    }

    private static void animalChanges(Animal animal, int legs){
        if (legs == 4) {
            animal.setLegs(legs);
        }else {
            System.out.println(legs + " is Wrong value");
        }
        animal.say();
    }

    private static void instanceofExample(Animal animal) {
        if (animal instanceof Cat){
            System.out.println("It`s a cat");
            ((Cat)animal).meow();
        }
        if (animal instanceof Dog) {
            System.out.println("It`s a dog");
        }
    }
}

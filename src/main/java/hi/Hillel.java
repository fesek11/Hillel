package hi;

//import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Hillel {
    public static void main(String[] args) {

        Lecture3 lecture3 = new Lecture3();

        System.out.println(lecture3.danceHours());
//Перегрузка
        calculate calculate1 = new calculate(); //вызов метода из другого клаасса
        int sum = calculate1.sum(2, 3);
        System.out.println(sum);
        int sum1 = (int) calculate1.sum(1.1, 1.1, 1);
        System.out.println(sum1);

        innerMethod(); // Вызов внутреннего метода


        Lecture3.move(); // Вызов Static метода из статического класса

        calculate cal = new calculate();
        System.out.println(cal.sum(1.1, 1.2));

        Lecture3 lec = new Lecture3();
        lec.print();
//SCANNER
 /*       Scanner scanner = new Scanner(System.in);
        System.out.println("Some text:");
        String next = scanner.nextLine();
        System.out.println("Entered some text:" + next);

        System.out.println("AGE:");
        int age = scanner.nextInt();
        System.out.println("YOUR age" + age);

        */

        System.out.println(Math.sqrt(9));
        System.out.println(Math.abs(-15));
        System.out.println(Math.min(-15, 15));
        System.out.println(Math.max(-15, 15));
        System.out.println(Math.random());

        int rand = (int) (Math.random() * 100);
        System.out.println(rand);

        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextBoolean());

        User user = new User();
        user.age = 12;
        user.name = "Den";
        user.surname = "fes";

        String identification = user.identification();
        System.out.println(identification);

        user.identification1();
        System.out.println(user.identification2());

        user.identification1();
        String ident2 = user.identification2();

        User user1 = new User();
        user.age = 12;
        user.name = "Den";
        user.surname = "fes";
        System.out.println(user.identification());

        System.out.println(user == user1);
    }
        private static void innerMethod() {
        System.out.println("Inner");
    }


}

package Tasks;

import java.util.Scanner;

public class Wfirst {
    public static void main(String[] args) {

        int age;
        String name;
        String surname;
        String mail;
        String something;

        Per();


        Wfifth pers = new Wfifth();  //Вызов метода из пятого задания
        pers.ZpRandom();
        pers.ZpRandomMath();

        Wthird pers1 = new Wthird();  //Вызов метода из пятого задания
        pers1.Randomize();

    }

    public static void Per() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сколько вам полных лет");
        int age = scanner.nextInt();

        System.out.println("Ваше Имя");
        String name = scanner.next();

        System.out.println("Ваше Фамилия");
        String surname = scanner.next();

        System.out.println("Ваш имеил");
        String mail = scanner.next();

        System.out.println("Несколько слов про вас");
        String something = scanner.nextLine();
        String ds = scanner.nextLine(); // Добавил эту строку, так как консоль не давала ввести данные "String something = scanner.nextLine();"
        System.out.println("Подсумируем: " + age + " " + name + " " + surname + " " + mail + " " + something);

    }

}

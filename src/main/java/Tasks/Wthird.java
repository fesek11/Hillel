package Tasks;

import java.util.Random;
import java.util.Scanner;

public class Wthird {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public void Randomize() {
        System.out.println("Введите количество участников:");
        int number = scanner.nextInt();
        System.out.println("Поздравляем, победил участник под номером: " + (random.nextInt(number) + 1) + "!");

    }
}

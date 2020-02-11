package Tasks6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class Task1 {


    public static void main(String[] args) throws IOException {

        //task1();
        //task2();
        // task3();
        //    Task1 pass = new Task1();

        //  getRegistration();

        getLogin();

    }

    private static void getLogin() throws IOException {
        String log, pass; //создаю 2 переменные имя/пароль
        String filepath = "C:\\Users\\XXX\\IdeaProjects\\Java\\src\\Tasks6\\login.txt"; //путь
        FileWriter writer = new FileWriter(filepath, true); //обьявляю райтер
        FileReader reader = new FileReader(filepath);//ридер
        Scanner scanner = new Scanner(System.in); //создаю обьект сканер для чтения со строки
        Scanner scannertry = new Scanner(reader); //создаю обьект сканертрай для чтения с файла по пути

        System.out.println("Vvedite log");
        log = scanner.next();
        System.out.println("Vvedite pass");
        pass = scanner.next();
        while (scannertry.hasNextLine()) {
                if(scannertry.nextLine().equals(log)){
                    if (scannertry.nextLine().equals(pass)) {
                        System.out.println("Priv");
                        break;
                    }
                }
                writer.write(log + "\n");
                writer.write(pass + "\n");

        }

        writer.close();

        scannertry.close();
        reader.close();


    }

    private static void getRegistration() throws IOException {


        String pass, passTry, log;
        String filepath = "C:\\Users\\XXX\\IdeaProjects\\Java\\src\\Tasks6\\registration.txt";
        FileWriter user = new FileWriter(filepath, true);
        FileReader reader = new FileReader(filepath);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин: ");
        log = scanner.nextLine();
        System.out.println("Введите пароль: ");
        pass = scanner.nextLine();
        System.out.println("Повторите пароль: ");
        passTry = scanner.nextLine();

        if (!pass.equals(passTry)) {
            System.out.println("Введен неправильный пароль: ");
            scanner.close();
        } else {

            user.write("Логин: " + log + "\n" + "Пароль: " + pass + "\n");
        }
        user.close();
        scanner.close();
    }

    private static void task3() throws IOException {


        String filepath = "C:\\Users\\XXX\\IdeaProjects\\Java\\src\\Tasks6\\111o.txt";
        Path path = Paths.get(filepath);
        if (!Files.exists(path)) {
            Files.createDirectories(path.getParent());
        }
        FileWriter fileWriter1 = new FileWriter(filepath);
        String poem = "Ночь, улица, фонарь, аптека \nБессмысленный и тусклый свет \nИ проживи хоть четверть века — \nВсё будет так. Исхода нет";
        String poemtry[] = new String[4];
        fileWriter1.write(poem);
        fileWriter1.close();
        FileReader fileReader = new FileReader(filepath);
        Scanner scanner = new Scanner(fileReader);

        if (poemtry.length == 4) {
            System.out.println("Всё записано верно!");
        }

        for (int i = 0; i < 4; i++) {
            poemtry[i] = scanner.nextLine();
        }
        for (int i = 0; i < poemtry.length; i++) {
            System.out.println(poemtry[i]);
        }

        fileReader.close();
        scanner.close();


        fileReader.close();
        scanner.close();
    }

    private static void task2() {
        char unicodeChar = 5785, second = 2650, third = 1161, forth = 1160, fifth = 2951;
        System.out.println(second + " " + unicodeChar + " " + forth + " " + fifth + " " + third);
    }

    private static void task1() {
        String s = " Hillel is my feature. I will be developer   ";

        System.out.println(s.isEmpty());
        System.out.println(s.length());
        System.out.println(s.strip().length());
        System.out.println(s.contains("I"));
        System.out.println(s.charAt(23));
        System.out.println(s.substring(33, 42));
        System.out.println(s.concat("!"));
        System.out.println(s.strip().equals("Hillel is my feature. I will be DEVELOPER"));
        System.out.println(s.strip().equalsIgnoreCase("Hillel is my feature. I will be DEVELOPER"));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
    }
}

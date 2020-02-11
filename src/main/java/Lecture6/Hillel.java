package Lecture6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Hillel {
    public static void main(String[] args) throws IOException {

//final int VAR = 12;
//VAR = 10;

/* //стринг - неизеняемый обьект!
        String str = "First";
        str = "Second";
        String string = "Third";
        str = str + string; //конкотинация строк
        System.out.println("res = " + str);
*/
//        //String методы
//        String str = "   hello world ";
//        System.out.println("str.length() = " + str.length());
//        char[] chars = str.toCharArray();
//        System.out.println("chars[10] = " + chars[10]);
//        String trim = str.trim();
//        System.out.println("trim.length() = " + trim.length()); // обрезает пробелы вконце и вначале
//
//        System.out.println("str.isEmpty() = " + str.isEmpty()); // проверяет пустая ли строка
//        String empty = "";
//        System.out.println("empty.isEmpty() = " + empty.isEmpty());
//
//        String valueof = String.valueOf('a'); // Преобразовывать переменную в строку
//        System.out.println("valueof = " + valueof);
//
//
//        char charat = str.charAt(6);
//        System.out.println("charat = " + charat);
//
//        String concat = str.concat("123").trim().intern().strip();
//        System.out.println("concat = " + concat);
//
//        String upper = "HELLO";
//        String lower = "hello";
//        System.out.println("lower = " + upper.equals(lower));
//        System.out.println("lower = " + upper.equalsIgnoreCase(lower)); // равнивает, игнорируя регистр
//        String substr = "lesson 5";
//        System.out.println("substr.substring(7) = " + substr.substring(7)); // оставить часть строки с указанного индекса
//        System.out.println("substr.substring(0 = " + substr.substring(0,7).concat("6")) ; // оставить строку в указанных индексах
//        String password = "QwErtTy";
//        System.out.println("password = " + password.toUpperCase());
//        System.out.println("password = " + password.toLowerCase());
/*

        char unicodeChar = 681;
        System.out.println("unicodeChar = " + unicodeChar);
*/
        // Считывание и запись файла
    //    FileWriter fileWriter = new FileWriter();

      //  write();
        read();
    }

    private static void write() throws IOException {
        String fileName = "/Users/XXX/IdeaProjects/Java/src/Lecture6/java1.txt";
        Path dirpath = Paths.get(fileName);
        if (!Files.exists(dirpath.getParent())) {
            Files.createDirectories(dirpath.getParent());
        }
        FileWriter fileWriter = new FileWriter(fileName, true);
        fileWriter.write("Hillel\nSecond line");
        fileWriter.close();
        //fileWriter.write("12"); // будет ошибка
    }

    private static void read() throws IOException {
        String path = "/Users/XXX/IdeaProjects/Java/src/Lecture6/java1.txt";
        FileReader fileReader = new FileReader("/Users/XXX/IdeaProjects/Java/src/Lecture6/java1.txt");

        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()){
            System.out.println("scanner = " + scanner.nextLine());

        }
        fileReader.close();
        scanner.close();

    }

}


package Lecture6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Writer {
    public static void main(String[] args) throws IOException {

        String fileName = "/Users/XXX/IdeaProjects/Java/src/Lecture6/java1.txt";
        Path dirpath = Paths.get(fileName);
        if (!Files.exists(dirpath.getParent())) {
            Files.createDirectories(dirpath.getParent());
        }
        FileWriter fileWriter = new FileWriter(fileName, true);
        fileWriter.write("Hillel\nSecond line");
        fileWriter.close();
        //fileWriter.write("12"); // будет ошибка

        String path = "/Users/XXX/IdeaProjects/Java/src/Lecture6/java1.txt";
        FileReader fileReader = new FileReader("/Users/XXX/IdeaProjects/Java/src/Lecture6/java1.txt");

        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()){
            System.out.println("scanner = " + scanner.nextLine());

        }

    }

}


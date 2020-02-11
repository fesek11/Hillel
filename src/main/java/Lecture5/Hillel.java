package Lecture5;

import java.util.Date;
import java.util.Scanner;

public class Hillel {
    public static void main(String[] args) {

        Vozrast();


        //   delenieChisla();

/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text");
        String text = scanner.next();
        check(text);*/
      /*  Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.println(cat1.equals(cat2));*/

//        while (!scanner.next().equals("exit")) {
//            System.out.println("in program");
//           break;
//        }

        //arrayWithIF();



    //arrayConditions();
        //  switchCase2();
      //  switchCase1();
      //  switchCase();
    }

    private static void Vozrast() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of your birth: ");
        // int year = scanner.nextInt();

        int age = 2020-scanner.nextInt();
        if (age < 18) {
            System.out.println("Вход с 18");
        } else if (age >= 18 && age <= 50) {
            System.out.println("Добро пожаловать");
        } else {
            System.out.println("Вам будет не интересно");
        }

        Date date = new Date();
        System.out.println(date.toString());
    }

    private static void delenieChisla() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        // int result = number/2;
        int counter = 0;
        while (true) {
            number/=2;
            System.out.println(number);
            counter++;
            if (counter >= 5) {
                break;
            }
        }
    }

    public static void check(String text) {
        if (text.equals("return")) {
            return;
        } else {
            System.out.println("Text is not null");
        }
    }

    private static void arrayWithIF() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0){
                System.out.println("111");
            }
            else {
                System.out.println("222");
            }

        }
    }
    private static void arrayConditions() {
        int [][] doubleArray ={{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < doubleArray.length ; i++) {
            for (int j = 0; j < doubleArray.length; j++) {
                System.out.println(doubleArray[i][j]);
            }

        }
    }

    private static void switchCase2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a month");
        String month = scanner.next();

        switch (month) {
            case "January":
               System.out.println("It`s a winter");// потому что без брейка будет выдавать ту же фразу
            case "December":
                System.out.println("It`s a winter");
            case "February":
                System.out.println("It`s a winter");
                break;
            default:
                System.out.println("Other");
                break;
        }
    }

    private static void switchCase1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day");
        int number = scanner.nextInt();

        switch (number) {
            case 10:
                System.out.println("Number ten");
            case 100:
                System.out.println("One hundred");
            case  1000:
                System.out.println("One thousand");
        }
    }

    private static void switchCase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("It`s monday");
                break;
            case 2:
                System.out.println("It`s Tuesday");
                break;
            default:
                System.out.println("Other day");
                break;
        }
    }
}

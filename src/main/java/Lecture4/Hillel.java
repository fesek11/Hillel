package Lecture4;

import java.util.Scanner;

public class Hillel {
    public static void main(String[] args) {

        //Операторы
        // операторы цыкла While выполняй пока соответствует условию выполняй / do-while  пока соответствует условию выполняй выполняй / for
        int[] array = new int[]{1, 2, 3, 4, 5};
        whileExample2(array);
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        whileExample2(arr);
        int first = 100;
        int second = 90;
        dowhileExample(first, second);

        forExamp();
        new Scanner(System.in);

    //    ifelseexamp2();


    }

//    private static int[] ifelseexamp2() {
//        Random random = new Random();
//        int rand = random.nextInt(2);
//        int [] array2 = new int[rand];
//        System.out.println(rand);
//
//        if (array2.length > 0 ) {System.out.println("we can");}
//        else {
//            System.out.println("we can`t");
//        }
//    }

    private static void forExamp() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Increment = " + i);
        }
    }

    private static void dowhileExample(int first, int second) {
        do {
            System.out.println(first + second);
            first--;
        } while (first <= second);
    }

    private static void whileExample2(int[] array) {
        int increment = 0;
        int result;
        while (increment < array.length) {
            result = array[increment];
            System.out.println("Element " + increment + " : " + result);
            increment++;
        }
    }


    private static void whileExample() {
        int first = 10;
        int second = 5;

        while (first >= second) {
            System.out.println(first + second);
            first--;

        }

    }
}

package Tasks4;

public class Tasks4 {
    public static void main(String[] args) {
        int i = 1;
        while (i < 11) {
            System.out.println("i = " + i);
            i++;
        }
        for (int j = 1; j < 11; j++) {
            System.out.println("j = " + j);

        }
        whileLoop(100);
        int arr[] = new int[]{1, 23, 2, 21, 12, 56, 0, 0, -1, 42};
        loopForMax(arr); //Вызов метода по поиску максимального числа из массива arr[]
        loopForMin(arr); //Вызов метода по поиску минимального числа из массива arr[]

        int var = 5;
        doWhileLoop(var);

        int array[] = new int[10];
        arrayEightTask(array);
    }

    private static void arrayEightTask(int[] array) {
        for (int j = 0; j < array.length; j++) {
            array[j] = j + 1;
            if (j % 2 != 0) {
                System.out.println(array[j] + " чётное число");
            } else {
                System.out.println(array[j] + " нечётное число");
            }
        }
    }

    private static void doWhileLoop(int var) {
        do {
            System.out.println("Hillel the Best");
        }
        while (var < 0);
    }

    private static void loopForMax(int arr[]) {

        for (int j = 0; j < arr.length; j++) {
            int stan = 0;
            //   System.out.println("Елемент " + j);
            for (int now = 0; now < arr.length; now++) {
                if (arr[j] >= arr[now] & stan < arr.length) {
                    stan += 1;
                    //   System.out.println(arr[j] + ">" + arr[now]);
                    if (arr[j] >= arr[now] & stan == arr.length) {
                        System.out.println("MAX: " + arr[j]);
                    }
                }
            }
        }
    }

    private static void loopForMin(int arr[]) {

        for (int j = 0; j < arr.length; j++) {
            int stan = 0;
            //   System.out.println("Елемент " + j);
            for (int now = 0; now < arr.length; now++) {


                if (arr[j] <= arr[now] & stan < arr.length) {
                    stan += 1;
                    //   System.out.println(arr[j] + ">" + arr[now]);
                    if (arr[j] <= arr[now] & stan == arr.length) {
                        System.out.println("MIN: " + arr[j]);
                    }
                }
            }
        }
    }

    private static void whileLoop(int third) {

        while (third >= 0) {
            System.out.println("third = " + third);
            third -= 10;
        }
        forLoop();
    }

    private static void forLoop() {
        for (int i = 100; i >= 0; i -= 10) {
            System.out.println("i = " + i);
        }
    }


}
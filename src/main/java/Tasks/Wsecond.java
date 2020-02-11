package Tasks;


import java.util.Random;

public class Wsecond {
    public static void main(String[] args) {



        Random ints = new Random();
        int c = ints.nextInt();
        int a = ints.nextInt();
        int b = ints.nextInt();
        double dd = ints.nextDouble();
        double ad = ints.nextDouble();
        double bd = ints.nextDouble();

        int sum = (int) (b + a + c + dd + ad + bd);
        double sum1 =  b + a + c + dd + ad + bd;

        System.out.println(sum);
        System.out.println(sum1);


    }


}

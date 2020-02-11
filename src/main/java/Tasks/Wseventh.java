package Tasks;

public class Wseventh {
    public static void main(String[] args) {

        Mymath.Addition(1, 2);
        Mymath.Substraction(1, 1);

        Mymath mymath = new Mymath();
        mymath.Multyplication(2, 2);
        mymath.Division(2, 2);
    }

}

class Mymath {


    public static int Addition(int a, int b) {
        int summ = a + b;
        return summ;


    }

    public static double Substraction(double a, double b) {
        double sub = a - b;
        return sub;


    }

    public int Multyplication(int a, int b) {
        int multy = a * b;
        return multy;
    }

    public double Division(double a, double b) {
        double div = a / b;
        return div;
    }

}

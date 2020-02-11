package hi;

public class calculate {
    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double first, double second){
        return first + second;
    }
    public double sum(double first, double second, int third){
        return first + second + third;
    }
    public void sum(){
        System.out.println("Dont have parameters");
    }

    private void first(){
        second();
    }
    private static void second(){
      //  first(); //Из статик невозможно вызвать static
    }

}

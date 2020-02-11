package Task5;

public class Main {
    public static void main(String[] args) {
        int[] arreyNumbMaxValue = new int[]{901, -5, 56, 12, 9001, 0, -32, 12, -34, -56};
        int maxValue = arreyNumbMaxValue[0]; //Создаем переменную для циклической проверки чисел.
        for (int i = 1; i < arreyNumbMaxValue.length; i++) {
            if (maxValue < arreyNumbMaxValue[i]) {
                maxValue = arreyNumbMaxValue[i];
            }
        }
        System.out.println(maxValue);
    }
}

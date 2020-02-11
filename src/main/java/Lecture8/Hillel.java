package Lecture8;
//ctrl + alt + o удаляет неиспользуемые пакеты import

public class Hillel {
    public static void main(String[] args) {

        Human human = new Human("Den", "Fes", 11, 35);
        System.out.println(human.getName());
        human.setName("John");
        System.out.println(human.getName());
//        Validate validate = new Validate();
//        validate.validateNameAndSurname("   ", " ");
//
//        int salaryWuthTax = Constants.HOUR_SALARY * 40 * 4;
//        System.out.println("salaryWuthTax = " + salaryWuthTax);

    }
}

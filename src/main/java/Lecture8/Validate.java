package Lecture8;
//import Lecture8.Hillel;

public class Validate {
    public void validateNameAndSurname(String name, String surname) {
        validateName(name);
        validateSurname(surname);
    }

    private void validateName(String name) {
        if (name.trim().isEmpty() || name == null) {
            System.out.println("Name is empty");
            return;
        }
        System.out.println("name" + name);
    }
    private void validateSurname(String surname) {
        if (surname.trim().isEmpty() || surname == null) {
            System.out.println("Surname is empty");
            return;
        }
        System.out.println("name" + surname);
    }
}

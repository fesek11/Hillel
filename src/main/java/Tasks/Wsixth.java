package Tasks;

import java.util.Objects;

public class Wsixth {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.salary = 1000;
        employee.position = "Junior";
        employee.age = 23;

        Employee employee2 = new Employee();
        employee2.salary = 1000;
        employee2.position = "Junior";
        employee2.age = 23;

        System.out.println(employee == employee2);
        System.out.println(employee.equals(employee2));

    }

}

class Employee {
    double salary;
    String position;
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                age == employee.age &&
                Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, position, age);
    }
}

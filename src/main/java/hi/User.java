package hi;

//import static java.lang.System.out;

public class User {

    int age;
    String name;
    String surname;

    public String identification(){
        System.out.println(age + name + surname);
        return "OK!";
    }

    public void identification1(){
        System.out.println(age + name + surname);
    }

    public String identification2(){
        return age + " " + name + " " + surname;
    }
}

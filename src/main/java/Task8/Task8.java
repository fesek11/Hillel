package Task8;


public class Task8 {
    public static void main(String[] args) {
        Task3House task3House = new Task3House();
        task3House.chair.setLegs(3);;
        task3House.chair.setName("new chair");
        task3House.chair.setWeight(2.3);
        task3House.penal.setLegs(4);
        task3House.penal.setName("penal");
        task3House.table.setWeight(2.3);
        task3House.table.setLegs(1);
        task3House.table.setName("new table");

     //   System.out.println(task3House.toString());
    }
}

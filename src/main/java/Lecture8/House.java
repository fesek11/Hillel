package Lecture8;

public class House {
    public String firstWall;
    public String secondWall;
    public String thirdWall;
    public String fourthWall;
    public String fifthWall;
    private double cost;
    private boolean custom;

    public House (){

    }

    @Override
    public String toString() {
        return "House{" +
                "firstWall='" + firstWall + '\'' +
                ", secondWall='" + secondWall + '\'' +
                ", thirdWall='" + thirdWall + '\'' +
                ", fourthWall='" + fourthWall + '\'' +
                ", fifthWall='" + fifthWall + '\'' +
                ", cost=" + cost +
                ", custom=" + custom +
                '}';
    }
}

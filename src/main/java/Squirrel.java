import java.util.ArrayList;

public class Squirrel {

    int weight = (int)(400*Math.random()+1);
    int age = (int)(7*Math.random()+1);
    int numOfConesInNest;
    String prey;
    boolean hungry= false;

    public Squirrel(int weight, int age, int numOfConesInNest) {
        this.weight = weight;
        this.age = age;
        this.numOfConesInNest = numOfConesInNest;
    }

    public int getAge() {
        return age;
    }
    public int getWeight() {
        return weight;
    }
    public int getNumOfConesInNest() {
        return numOfConesInNest;
    }

    public static boolean eat(boolean hungry) {

        return true;
    }
}

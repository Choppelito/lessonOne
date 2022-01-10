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


    public static boolean eat(int weight, int age, int numOfConesInNest) {
        boolean full= false;
        if (weight > 300 || age > 7 && numOfConesInNest > 1){
            full= true;
        }
        return full;
    }

}

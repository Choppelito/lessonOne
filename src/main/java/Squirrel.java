import java.util.ArrayList;

public class Squirrel {

    int weight;
    int age;
    int numOfConesInNest;
    String prey;


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

    public static boolean eat(int numOfConesInNest){
        if (numOfConesInNest >= 2){
            return true;
        }
        else {
            return false;
        }
    }
}

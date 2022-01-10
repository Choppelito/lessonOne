import java.util.ArrayList;

public class index {
    public static void main(String[] args) {

        pinetree pinetree = new pinetree();
        pinetree.bigTree();

        owl owl = new owl(1.5, 8, true);

        storyline storyline = new storyline();
        storyline.playStory();



        ArrayList<Squirrel> squirrels = new ArrayList<>();

        squirrels.add(new Squirrel(5, 12, 24));
        squirrels.add(new Squirrel(4, 7, 16));
        squirrels.add(new Squirrel(6, 2, 12));
        squirrels.add(new Squirrel(5, 6, 17));
        squirrels.add(new Squirrel(4, 10, 7));

        //Squirrel.eat();//
    }
}

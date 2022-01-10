import java.sql.SQLOutput;
import java.util.ArrayList;

public class index {
    public static void main(String[] args) {

        pinetree pinetree = new pinetree();
        pinetree.bigTree();

        ArrayList<Squirrel> squirrels = new ArrayList<>();
        squirrels.add(new Squirrel(100, 12, 24));
        squirrels.add(new Squirrel(140, 7, 16));
        squirrels.add(new Squirrel(300, 2, 12));
        squirrels.add(new Squirrel(450, 6, 17));
        squirrels.add(new Squirrel(240, 10, 7));

        owl owl = new owl(120, 10, true);

        storyline storyLine = new storyline();
        storyLine.playStory();


        boolean mat = Squirrel.eat((int)(400*Math.random()+1), (int)(7*Math.random()+1), (int)(10*Math.random()+1) );
        if (mat == true){
            System.out.println("Squirrel is full");
        }else {
            System.out.println("Squirrel is hungry!");
        }

        boolean food = owl.eat((int)(200*Math.random()+1), (int)(20*Math.random()+1));
        if (food == true){
            System.out.println("Owl is full");
        }else {
            System.out.println("Owl eats squirrel");



        }
    }
}

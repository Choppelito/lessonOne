import java.util.Scanner;
public class storyline {

    public void playStory(){
        while(true) {
            Scanner input = new Scanner(System.in);
            mainStory();
            System.out.println("Välj 1 för grenen med antalet kottar: " + pinetree.howManyCones());
            System.out.println("Välj 2 för grenen med antalet kottar: " + pinetree.howManyCones());
            int choice = input.nextInt();
            int owl = (int)(2*Math.random()+1);
            if (choice == owl) {
                System.out.println("Nu tog ugglan dig!");
                System.out.println("Vill du spela en gång till?\n1. Ja\n2. Nej");
                int quit = input.nextInt();
                if (quit == 2){
                    break;

                }
            } else if (choice != owl) {
                System.out.println("Du klarar dig en stund till!");
            }
        }
    }

    public void mainStory(){
        System.out.println("Ekorrn satt i granen, skulle skala kottar. " +
                "\nFick hen syn på ugglan, då fick hen så bråttom. " +
                "\nSkulle välja en ny gren, men visste inte vad som hände sen...");
    }
}

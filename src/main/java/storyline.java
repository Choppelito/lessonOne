import java.util.Scanner;
public class storyline {

    public void playStory(){
        while(true) {
            Scanner input = new Scanner(System.in);
            mainStory();
            System.out.println("Välj 1 för grenen med antalet kottar: " + pinetree.howManyCones());
            System.out.println("Välj 2 för grenen med antalet kottar: " + pinetree.howManyCones());
            int choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Nu tog ugglan dig!");
                break;
            } else if (choice == 2) {
                System.out.println("Du klarar dig en stund till!");
            }
        }
    }

    private void mainStory(){
        System.out.println("Ekorrn satt i granen, skulle skala kottar. " +
                "\nFick hen syn på ugglan, då fick hen så bråttom. " +
                "\nSkulle välja en ny gren, men visste inte vad som hände sen...");
    }
}

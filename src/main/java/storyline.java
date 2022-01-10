public class storyline {

    public void playStory(){
        mainStory();
        System.out.println("Välj 1 för grenen med antalet kottar: " + pinetree.howManyCones());
        System.out.println("Välj 2 för grenen med antalet kottar: " + pinetree.howManyCones());
        int choice = Integer.parseInt(System.console().readLine());
    }

    private void mainStory(){
        System.out.println("Ekorrn satt i granen, skulle skala kottar. " +
                "\nFick hen syn på ugglan, då fick hen så bråttom. " +
                "\nSkulle välja en ny gren, men visste inte vad som hände sen...");
    }
}

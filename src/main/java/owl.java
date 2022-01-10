public class owl {
    double wingspan;
    int age;
    boolean hungry;
    String predator;



    public owl(double wingspan, int age, boolean hungry){
        this.wingspan = wingspan;
        this.age = age;
        this.hungry = hungry;
    }

    public double getWingspan() {

        return wingspan;
    }

    public int getAge() {
        return age;
    }


    public static boolean eat(boolean hungry){
        return true;

    }
}

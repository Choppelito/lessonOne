public class owl {
    int wingspan;
    int age;
    static boolean eat;
    String predator;

    public owl(int wingspan, int age, boolean eat){
        this.wingspan = wingspan;
        this.age = age;
        this.eat = eat;
    }

    public static boolean eat(int wingspan, int age){
        boolean full = false;
        if (wingspan>50 && age>5 || wingspan<180 && age<19){
            full=true;
        }
        return full;
    }
}

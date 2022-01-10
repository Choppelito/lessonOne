public class owl {
    int wingspan = (int)(200*Math.random()+1);
    int age = (int)(20*Math.random()+1);
    boolean eat = eat(wingspan, age);
    String predator;

    public owl(int wingspan, int age, boolean eat){
        this.wingspan = wingspan;
        this.age = age;
        this.eat = eat;
    }

    public boolean eat(int wingspan, int age){
        boolean full = false;
        if (wingspan>100 && age>10 || wingspan>150 && age<10){
            full=true;
        }
        return full;
    }
}

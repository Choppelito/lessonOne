public class pinetree {

    public void bigTree(){

        int numOfCones = howManyCones();
        int age = age();
        int wind = wind();
        int height = height();
        boolean fallen = fallen(age, wind, height);
    }

    public static int howManyCones(){
        return (int)(5*Math.random());
    }

    private int age(){
        return (int)(200*Math.random()+1);
    }

    private boolean fallen(int age, int wind, int height){
        boolean fallen = false;
        if (age>150 && wind>8 && height>10){
            fallen = true;
        }
        else if (wind>10 && height>20){
            fallen = true;
        }
        return fallen;
    }

    private int height(){
        return (int)(30*Math.random()+1);
    }

    private int branches(int height){
        return height * 2;
    }

    private int wind(){
        return (int)(15*Math.random()+1);}
}

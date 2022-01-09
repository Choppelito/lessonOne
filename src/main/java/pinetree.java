public class pinetree {

    public void bigTree(){

        int numOfCones = howManyCones();
        int age = age();
        boolean fallen = fallen(age);
        int height = height();
        int branch = branches(height);

    }
    private int howManyCones(){
        return (int)(5*Math.random());
    }

    private int age(){
        return (int)(200*Math.random()+1);
    }

    private boolean fallen(int age){
        return age > 150;
    }

    private int height(){
        return (int)(30*Math.random()+1);
    }

    private int branches(int height){
        return height * 2;
    }
}

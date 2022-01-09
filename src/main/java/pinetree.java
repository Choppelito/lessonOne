public class pinetree {

    public void Run(){

        int numOfCones = 0;
        int age = randomAge();
        boolean fallen = false;

        if (age>150){
            fallen = true;
        }

    }

    public int randomAge(){
        int random;
        random = (int)(200*Math.random()+1);
        return random;
    }
}

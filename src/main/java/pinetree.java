public class pinetree {

    public void bigTree(){

        int numOfCones = howManyCones();
        int age;
        int wind;
        int height;
    }

    public static int howManyCones(){
        return (int)(5*Math.random());
    }


    public boolean fallen(int age, int wind, int height){
        boolean fallen = false;
        if (age>150 && wind>8 && height>10){
            fallen = true;
        }
        else if (wind>10 && height>20){
            fallen = true;
        }
        return fallen;
    }



}

package constructors;

public class Light {
    boolean lightSwitchPosition;
    static  String time = "day";

    int x;

    public Light(){
        System.out.println("This is default constructor");
    }

    /**
     * Parameterized constructor
     * */
    public Light(int y){

       // this.x = y;
        System.out.println("I am in parameterized constructor argument:" + y);

    }

    public void turnOnLight(){

        lightSwitchPosition = true;
        System.out.println("Light is turned on");

    }

    public void turnOfFLight(){
        lightSwitchPosition = false;
        System.out.println("Light is turned off");

    }

    public void createLightObjectByParameterizedOperator(){

        Light tubeLight = new Light(2);

        int numbuerOfTubeLight = 4;

        if(time=="day"){
            tubeLight.turnOfFLight();

        }
        else {
            tubeLight.turnOnLight();
        }

    }

    public static void main(String[] args) {

        Light bedLight = new Light();

        bedLight.createLightObjectByParameterizedOperator();

    }
}

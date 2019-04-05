package Quiz;

public class Light {

    boolean lightSwitchPosition;
    static  String time = "day";

    /**
     * 1. Declare a class variable called lightName and assign value to Bed Light
     * 2. Declare and assign value 2 to an int reference variable called numberOfBedLight
     * */

    /**
     * Create default constructor with print statement
     * */

    public void turnOnLight(){

      lightSwitchPosition = true;
        System.out.println("Light is turned on");

    }

    /**
     * Create a method which will turn off the light
     *
     * */

    public void turnOfFLight(){
        lightSwitchPosition = false;
        System.out.println("Light is turned off");

    }

    public static void main(String[] args) {

        Light bedLight = new Light();

        /**
         * Create an object called bedLight
         * Use a if else statement to turn on and turn of the light according to
         * the value fo the variable time and using two other methods
         *
         * */

        if(time=="day"){
            bedLight.turnOfFLight();

        }
        else {
            bedLight.turnOnLight();
        }

    }

}

package Quiz.inheritance;

public class Nokia5510 extends Nokia1100  {

    /**
     * Make necessary changes to inherite Nokia1100 properties
     * Crete a method to add colorful display named colorFulDisplay()
     * Crete a method to play games named games()
     * Declare and assign value to a String instance variable called nameOfTheClass
     *
     * */

    public Nokia5510(){
        /**
         * super() is super class constructor
         * Which one is super class of Nokia5510? Ans: Nokia1100
         * */
        super();
    }

    public void makeCallByNokia5510(){

        super.makeCall();

    }

    public static void main(String[] args) {
        /**
         * Try to get value of the nameOfClass
         * */

        Nokia5510 objNokia5510 = new Nokia5510();

        objNokia5510.makeCallByNokia5510();

    }
}

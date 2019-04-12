package Quiz.inheritance;

public class Nokia1100 extends PreNokia1100 {


    /**
     * Make necessary changes to inherite PreNokia1100
     * Declare and assign value to a String instance variable called nameOfTheClass
     * Implement a method to add photo gallery photoGallery()
     * Create default constructor and a parameterized constructor with int x parameter
     * */

    public Nokia1100(){
        System.out.println("I am default constructor of Nokia1100");
    }

    public void makeCall() {
        System.out.println("I am makeCall() method of Nokia1100");
    }
}

package inheritance;

public abstract class SampleNokiaPhone implements  SymbianPhone {

    /**
     * An interface can only be implemented by class, class cant extend interface
     * class can only extend abstract class or class and can implement an interface
     * */

    /**
     *  When a class have at least one unimplemented method/ abstract method
     *  that class is called abstract class
     *  Abstract class cant be instantiated
     *
     * */

    int x = 4;

    public  String sendText(){

        String message = "This method is responsible to send text";

        System.out.println(message);

        return message;
    }

  /**
   * Unimplemented method from SymbianPhone interface
   * Awaiting implementation
   * */
   public abstract void makeCall();

    public void createContactList(){
        System.out.println("This method will help to create contact list option");
    }
}

package others;

public class StringDemo {

/**
 * Where there is class there should be what?
 * 1. methods
 * 2. main method
 * 3. default Constructor
 * 4. Reference variables
 * 5. Variable
 * */

public static void main(String[] args) {

    /**
     *  Without method can  we do any job? No
     *  Can we execute a non static method without an object ? No
     *  Can we create an object without a class? No
     *
     * */

    int x = 2;
    int y =4;
    int sum= x + y ;

    /**
     * System  Looks like? -->  class
     * out Looks like? -->  Reference variable in System Class
     * What are the fields are being named with small letter first? reference variable and method
     * println() ---> method
     * */

    System.out.println("Learning Java API documentations");

    String name = "jahiudl islam";
    System.out.println(name);

    System.out.println("Find the fist letter of name: " + name.charAt(0));


     /***
      *
      * Read String API documentation and
      * Show application of 30 String methods, I showed on above
      *
      * */
  }

}

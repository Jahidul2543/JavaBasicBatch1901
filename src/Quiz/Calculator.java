package Quiz;

public class Calculator {

    /**
     * @author Jahidul Islam
     * Declare an String variable named statement
     * */

    String statement;

    /**
     * Create a default constructor of Calculator class and provide a
     * print statement "This constructor can create Basic calculator object" in body
     *
     * */
    /**
     * Create a parameterized constructor of Calculator class with the String statement parameter
     * Assign description to instance variable statement using this keyword
     *
     * */



    public int add(int a, int b){
        int result = a+b;
        System.out.println("Total: " + result);
        return result;
    }
    /**
     * Create a method which can multiply two int variables
     * Remember we want to use this method again and again like add() method
     *
     * */



    /**
     * Create a method which can divide two int variables
     * Remember we want to use this method again and again like add() method
     *
     * */

    public static void main(String[] args) {
        /**
         * Let us assume that this calculator has two mode Basic and Scientific
         *
         * 1. create an instance of the class Calculator using default constructor named basicCalculator
         * 2. using basicCalculator reference variable add two value 4 and 5
         * 3. using basicCalculator reference variable multiply two value 4 and 5
         *
         * */

        /**
         *
         * 1. create an instance of the class Calculator using default constructor named scientificCalculator
         * 2. using scientificCalculator reference variable add two value 4 and 5
         * 3. using scientificCalculator reference variable multiply two value 4 and 5
         * */

    }
}

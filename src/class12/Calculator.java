package class12;

public class Calculator {

    /**
     * Method Over Loading
     * There are two addition() with different method signature
     * in same class (Remember we talked about overloaded truck!!!!)
     * It means method parameters are different
     * 1. Same class
     * 2. Different signature
     *
     * */


    public int addition(int x, int y){

        int sum = x +y;
        System.out.println("Total: " + sum);
        return  sum;
    }

    /**
     * This method is a overloaded method
     * */

    public int addition(int x, int y, int z){

        int sum = x + y + z;
        System.out.println("Total: " + sum);
        return sum;
    }

    public static void main(String[] args) {

        Calculator obj = new Calculator();
        obj.addition(4, 4);
        obj.addition(4, 4, 8);


    }
}

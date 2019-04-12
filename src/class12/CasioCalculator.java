package class12;

public class CasioCalculator extends Calculator {
    /**
     * Method Overriding
     * Same name and same signature of super class method
     * Overriding happens between two classes
     * */

    @Override
    public int addition(int x, int y, int z){

        int sum = x + y;
        return sum;

    }

    public int multiply(int x, int y){
        int result = x*y;

        return result;
    }

    public int multiply(int x, int y, int z){
        int result = x*y;

        return result;
    }
}

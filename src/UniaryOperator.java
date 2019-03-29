public class UniaryOperator {

    public static void main(String[] args) {

        int result = +1;

        // result is now 1

        System.out.println(result);

        // Post decrement operator
        result--;

        // result is now 0
        System.out.println(result);

        // Post increment
        result++;
        // result is now 1
        System.out.println(result);

        result = -result;
        // result is now -1
        System.out.println(result);
        // success is reference variable
        boolean success = false;
        // false
        System.out.println(success);
        // true
        System.out.println(!success);

    }


}

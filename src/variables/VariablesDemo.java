package variables;

public class VariablesDemo {
    /**
     * Simple explanation on Types of Variables
     * @author Jahidul Islam
     *
     */

    /**
     * Is this out side the method? Ans: Yes
     * Is there any static key word before int? Ans: No
     * a is a Instance Variable
     * */
      int a = 2;

      /**
       * Is this out side the method? Ans: Yes
       * reference variable = name
       * reference variable type = others.StringDemo
       * Is there any static key word before reference variable type? Ans: Yes
       * This is called class variable
       * Why?
       * */

    static  String name = "Jahidul";


    public static void main(String[] args) {
        /**
         * Two types of data is in Java
         *   1. Primitive data type (8)--> int, short, byte, long, char, float, double, boolean
         *      others.StringDemo
         *   2. Object Type  --->  How many/much object type data in Java? Ans: No Limit
         *
         * Here objOfVariableDemo is a reference variable
         * */

        VariablesDemo  objOfVariableDemo = new VariablesDemo();
        objOfVariableDemo.sum();

        int z =5;
        objOfVariableDemo.showParameterVariableExample("saifulsName"); // This "saifulsName" is called arguments

    }

    public void sum(){

        /**
         * Is this variable x out side the method? Ans: No
         * That means it is inside the method
         * x is a Local Variable
         * */

        int a = 4;
        int y= 5;
        int sum = a+y;
        System.out.println("Sum: " + sum);

        /**
         * Call class variable by class name
         * Call instance variable by object/instance of the VariableDemo class
         *
         * */

        String myName = VariablesDemo.name;

        System.out.println("Calling a class variable using ClassName: " + myName);

        VariablesDemo obj = new VariablesDemo();

        int v = obj.a;

        System.out.println("Calling Instance variable using instance(Object) of the VariableDemo Class> Value must be 2: " + v);

    }

    /**
     *
     * Variable Type: Parameter
     * Anything inside the method parenthesis
     * saifulsName is a refrence variable
     * Here saifulsName is called parameter type of variable
     * --> Variable declared inside the method signature is called Parameter type of variable
     * */
    public void showParameterVariableExample(String saifulsName){

        // saifulsName = "Saiful ";

        System.out.println(" Saiful's Name: " + saifulsName);

    }

}

/**
 * Class variable, instance variable, local variable  are all of them are data type? Ans: Types of variable
 *
 * */
public class ClassVariableDemo {

    public static void main(String[] args) {

        String myName = VariablesDemo.name;

        System.out.println("Calling a class variable using ClassName: " + myName);

        VariablesDemo obj = new VariablesDemo();

        int v = obj.a;

        System.out.println("Calling Instance variable using instance(Object) of the VariableDemo Class> Value must be 2: " + v);


    }
}

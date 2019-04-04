package classobjectmethod;

public class Laptop {

   // Declared and assigned value to name variable
    String name = "Jahidul";
   // declared a variable will assign value in a method
   static int x ;

   public Laptop(){
       System.out.println("I am inside the constructor");
   }

   public int calculate(){

       int y = 5;
       Laptop.x = 6;
       int z;
       z = 6;

       int sum = x + y +z;
       return sum;
   }

    public static void main(String[] args) {
        Laptop asus = new Laptop();

        int total = asus.calculate();
        System.out.println("Total: " + total);

    }

}

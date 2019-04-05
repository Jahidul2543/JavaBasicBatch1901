package classobjectmethod;

public class Phone {



    public Phone(){

        System.out.println("You are using constructor to build classobjectmethod.Phone objects");

    }


    public static void main(String[] args) {


        String firstName = "Jahidul";
        String lastName = "Islam";

             char grade = '1';

             boolean lightStatus = true;

                   /**
                   * Jahidul turned off his light
                   * short,int, long, byte, float, double, boolean, char
                   * */
                     lightStatus = false;

      /**
       *
       * Adding others.StringDemo reference variables or variables is called others.StringDemo concatenation
       *
       * */

        String name = firstName +" " +lastName;
        System.out.println("My Name " + name);

        /**
         * Let's create an Object of classobjectmethod.Phone Type
         * Law to create an Object
         * ClassName objectName = new ClassName();
         * This default constructor = ClassName()
         *
         * */

        Phone asusPhone = new Phone();
         asusPhone.sum();

    }


  public void sum(){
        int a = 2;
        int b = 4;
        int sum = a+b;
      System.out.println("Total value: "+sum);
  }


}

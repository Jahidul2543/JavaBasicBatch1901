package dataStructure;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

       // ArrayList arrayDemo = new ArrayList();

        /**
         *
         * What we expect from a Java Class or Java API?
         * Fields
         * methods
         *
         * */

        // what is the type fo studentsName. String/List
        // Type of element has to be Object type
        List<String> studentsName = new ArrayList<>();

        studentsName.add("Mahmudul"); // 0
        studentsName.add("Alma");// 1 //0
        studentsName.add("Rafi");//2 //1
        studentsName.add("Jack");//3 //2

       /* System.out.println( "Value of Index 0: " + studentsName.get(0)); // Mahmudul

        studentsName.remove(0);*/

        System.out.println("Using foreach loop to get the value from the list ");

        for (String str : studentsName ){

           System.out.println(str);

       }

        System.out.println("Using foreach() method to get the value from the list ");

        studentsName.forEach(str -> System.out.println(str));

      //  System.out.println( "Value of Index 0: " + studentsName.get(0)); // Alma

      //  System.out.println("Size of the list: " + studentsName.size());


   /**
    * How can we store integer in List?
    *
    * */

     List<Integer> integerList = new ArrayList<>();

     integerList.add(12);
     integerList.add(14);

        System.out.println("Printing Integer element");
     integerList.forEach(x -> System.out.println(x));



    }

}

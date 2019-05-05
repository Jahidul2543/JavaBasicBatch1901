package dataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataStructuretDemo {

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


        /**
         *
         * We can store null value
         * Duplicate value
         * */
        List<String> studentsName = new ArrayList<>();

        studentsName.add("Mahmudul"); // 0
        studentsName.add("Alma");// 1 //0
        studentsName.add("Rafi");//2 //1
        studentsName.add("Jack");//3 //2
        studentsName.add(null);
        studentsName.add("Alma");



        System.out.println("Using foreach loop to get the value from the list ");

        for (String str : studentsName ){

           System.out.println(str);

       }

        List<Integer> studentId = new ArrayList<>();

        studentId.add(1);
        studentId.add(2);
        studentId.add(3);
        studentId.add(4);// index 3
        studentId.add(5);
        studentId.add(5);
        studentId.add(null);

        studentId.forEach(id-> System.out.println(id));

        System.out.println("Get Index 3: "+studentId.get(3));


      /*  System.out.println("Using foreach() method to get the value from the list ");

        studentsName.forEach(str -> System.out.println(str));

       System.out.println( "Value of Index 0: " + studentsName.get(0)); // Alma

        System.out.println("Size of the list: " + studentsName.size());
*/


    }

}

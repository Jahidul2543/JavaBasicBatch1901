package dataStructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {

        /**
         *
         * Map Key Value
         * Name = Jahidul
         * Name = Emtiaz
         * Map does not allow to enter duplicate value it means one key two value is not possible
         * Map allows to have null value
         * */

        Map<Integer, String>  studentInfoMap = new HashMap<>();

        studentInfoMap.put(12, "Mr X");
        studentInfoMap.put(13,"Mr Y");
        studentInfoMap.put(14,"Mr Z");
        studentInfoMap.put(15, null);
        studentInfoMap.put(12, "XXXXX");

        Set set = studentInfoMap.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()){

            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        System.out.println("********Iterating using for each loop or for each statement ************");

       for (Map.Entry<Integer, String> entry:studentInfoMap.entrySet()){

           System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());

       }
        System.out.println("********Iterating using foreach() ************");
       studentInfoMap.forEach((key, value)-> System.out.println("Key: " + key +" Value: " + value));


    }
}

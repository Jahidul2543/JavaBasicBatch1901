package class19;

public class StringBufferDemo {
    public static void main(String[] args) {

        /**
         *
         * String is immutable  --> once declared you cant change the string object/reference variable
         * If you change the value it will create a new refrence variable
         *
         * */
      //  String name1 = new String("Jahidul1");

        String str = "Hello";
               str = "JahidulJ";

               str.length();
             String  str2 = str.replace('J', 'Z');

        System.out.println(str);
       System.out.println(str2);

        /**
         *
         * StringBuffer is mutable
         * It is Thread Safe
         * */

        StringBuffer  studentName = new StringBuffer("Abbos");
        studentName.append("Nurimov");

        System.out.println(studentName);

        /**
         *
         * StringBuilder is also mutable
         * But it is not Thread Safe
         *
         * */
        StringBuilder obj = new StringBuilder("Hellllllllo");
        obj.append("Hi");
        System.out.println(obj);

    }
}

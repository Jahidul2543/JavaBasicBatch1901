package dataStructure;

public class ArrayDemo {

    public static void main(String[] args) {
        int x =2;

        // TypeOfElement [] arrayReferenceVariable = new TypeOfElement[lengthOfTheArray];

        int[] id = new int[6];

        id[0] = 10;
        id[1] = 11;
        id[2]= 12;
        id[3] = 13;
        id[4] = 14;
        id[5] = 15;


       int length = id.length;

        System.out.println(length);
        System.out.println("Index 0: " + id[0]);
        System.out.println("Index 1: " + id[1]);
        System.out.println("Index 2: " + id[2]);
        System.out.println("Index 3: " + id[3]);
        System.out.println("Index 4: " + id[4]);
        System.out.println("Index 5: " + id[5]);

    }


}

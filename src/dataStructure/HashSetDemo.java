package dataStructure;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Mr X");
        hashSet.add("Mr. Y");
        hashSet.add("Mr. Z");
        hashSet.add(null);
        hashSet.add("Mr X");

        for (String str : hashSet){
            System.out.println(str);
        }

        hashSet.forEach(str-> System.out.println(str));

    }
}

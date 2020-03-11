package practice.java.examples.collections.Set;

import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        HashSet hset=new HashSet<>(10);

        hset.add("45");
        hset.add("abc");
        hset.add(78.0);
        hset.add('p');
        System.out.println(hset);
        System.out.println(hset.add('p'));
        LinkedHashSet lHSet=new LinkedHashSet(hset);
        System.out.println(lHSet);
        System.out.println(lHSet.add('p'));

    }
}

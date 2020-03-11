package practice.java.examples.collections.Set;

import java.util.LinkedHashSet;

public class Example2 {
    public static void main(String[] args) {
        LinkedHashSet<String> lHSet=new LinkedHashSet<>();
        lHSet.add("virtusa");
        lHSet.add("polaris");
        System.out.println(lHSet);
        LinkedHashSet<String> lHSet1=new LinkedHashSet<>(lHSet);
        lHSet1.add("etouch");
        System.out.println(lHSet1);
        LinkedHashSet<String> lHSet2=new LinkedHashSet<>();
        lHSet2.add("pallav");
        LinkedHashSet<String> lHSet3=new LinkedHashSet<>();
        lHSet3.add("krishna");
        LinkedHashSet<String> lHSet4=new LinkedHashSet<>();
        lHSet4.addAll(lHSet3);
        lHSet4.addAll(lHSet2);
        lHSet4.addAll(lHSet1);
        lHSet4.add("a");
        System.out.println(lHSet4);
    }
}

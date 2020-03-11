package practice.java.examples.collections.Set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWrapperCompEx1 {
    public static void main(String[] args) {
        TreeSet<String> sTree=new TreeSet<>(new MyComp());
        sTree.add("asdf");
        sTree.add("lkjh");
        sTree.add("qwer");
        sTree.add("poiu");
        System.out.println(sTree);
        TreeSet<Integer> iTree =new TreeSet<>(new MyComp1());
        iTree.add(45);
        iTree.add(5);
        iTree.add(100);
        iTree.add(68);
        System.out.println(iTree);
    }

}
class MyComp implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
}
class MyComp1 implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return -o1.compareTo(o2);
    }
}

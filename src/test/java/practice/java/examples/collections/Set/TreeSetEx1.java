package practice.java.examples.collections.Set;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx1 {

    public static void main(String[] args) {
        TreeSet<String> stree=new TreeSet<>();
        stree.add("run");
        stree.add("todo");
        stree.add("versioncontrol");
        stree.add("terminal");
        stree.add("build");
        System.out.println("Sorted in asscending order \n"+stree);
        System.out.println("Sorted in descending order");
        Iterator<String> treeItr=stree.descendingIterator();
        while (treeItr.hasNext()){
            System.out.println(treeItr.next());
        }
        NavigableSet<String> nSet=stree.descendingSet();
        Iterator<String> nitr=nSet.iterator();
        while (nitr.hasNext()){
            System.out.println(nitr.next());
        }


    }
}

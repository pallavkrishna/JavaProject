package practice.java.examples.collections.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class Example1 {
    public static void main(String[] args) {
        try {
            ArrayList<String> al = new ArrayList<>();
            al.add("pallav");
            al.add("krishna");
            al.add("50");
            al.add("10");
            System.out.println("Before Sorting" + al);
            Collections.sort(al);
            System.out.println("After Sorting " + al);
            LinkedList ll = new LinkedList();
            ll.add(10);
            ll.add("45");
            System.out.println("Before Sorting" + ll);
            //Collections.sort(ll);// java.lang.Integer cannot be cast to java.lang.String
            System.out.println("After Sorting " + ll);

            Vector<String> ve = new Vector<>();
            ve.add("45");
            ve.add(null);
            System.out.println("Before Sorting" + ve);
            //Collections.sort(ve);//java.lang.NullPointerExceptio
            System.out.println("After Sorting " + ve);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

}

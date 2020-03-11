package practice.java.examples.collections.Cursors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ListIteratorCursor {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("45");
        list.add("50");
        list.add("05");
        list.add("01");
        System.out.println("Before sorting ");
        for(String print:list){
            System.out.println(print);
        }
        System.out.println("After sorting ");
        Collections.sort(list);
        System.out.println("after next ");
        //ListIterator using normal
        ListIterator lI=list.listIterator();
        String s;
        while (lI.hasNext()){
            s= (String) lI.next();
            System.out.println(s);
        }
        System.out.println("After previous ");
        while(lI.hasPrevious()){
            s= (String) lI.previous();
            System.out.println(s);
        }
        //ListIterator using generics
        ListIterator <String> sLI=list.listIterator();
        while ((sLI.hasNext())){
            s=sLI.next();
            System.out.println(s);
        }

        while (sLI.hasPrevious()){
            s=sLI.previous();
            System.out.println(s);
        }
    }


}

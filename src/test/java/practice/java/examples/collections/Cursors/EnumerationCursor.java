package practice.java.examples.collections.Cursors;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursor {
    public static void main(String[] args) {

        //vector for normal data
        Vector vector=new Vector<>();
        vector.add(45);
        vector.add("avc");
        vector.add(6.3);
        Enumeration e=vector.elements();
        while (e.hasMoreElements()){
            String s= e.nextElement().toString();
           System.out.println(s);
        }
        //vector for Generic data
        Vector <String> stringVector =new Vector<String>();
        stringVector.add("abc");
        stringVector.add("cde");
        stringVector.add("cde");
        stringVector.add("cde");
        Enumeration<String> e1=stringVector.elements();
        while (e1.hasMoreElements()){
            String s=e1.nextElement();
            System.out.println(s);
        }Collections.sort(stringVector);
        System.out.println(stringVector);

    }

}



package practice.java.examples.collections.Vectors;

import java.util.Iterator;
import java.util.Vector;

public class VEx1 {
    public static void main(String[] args) {
        Vector <Integer> vector=new Vector<>(30);
        for(int index=0;index<=vector.capacity()-1;index++){
            vector.add(index+1);
        }
        Iterator<Integer> numberIterator=vector.iterator();
        while (numberIterator.hasNext()){
            int n=numberIterator.next();
            if (n%2 != 0) {
                numberIterator.remove();
            }
        }
        for(Integer print: vector){
            System.out.println(print);
        }
    }


}

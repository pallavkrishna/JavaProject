package practice.java.examples.collections.LinkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Example1 {

    public static List<String> sLL=null;
    public static Deque<String> sq=null;
    public static void main(String[] args) {
        //List Implemented Linked List
        sLL=new LinkedList<>();

        sLL.add("abcd");
        sLL.add("asdf");
        sLL.add("pqrs");
        sLL.add("ijk");

        System.out.println(sLL);
        sLL.remove(1);
        sLL.remove("pqrs");
        System.out.println(sLL);
        //Deque Implemented Linked List
        sq=new LinkedList<>(sLL);
        System.out.println(sq);
        sq.addFirst("first");
        sq.addLast("last");
        System.out.println(sq);
        sq.removeFirst();
        System.out.println(sq);
        sq.removeLast();
        System.out.println(sq);

        System.out.println(sq.peekLast());
    }
}

package practice.java.examples.collections.LinkedList;

import practice.RealObjects.Book;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListCursor {
    public static void main(String[] args) {
        LinkedList<Book> ll=new LinkedList();
        ll.add(new Book(123,"the kite","jhon"));
        ll.add(new Book(456,"the byte","loin"));
        ll.add(new Book(787,"the lite","pool"));
        ListIterator <Book>ltr=ll.listIterator();
        while (ltr.hasNext()){
            Book b=ltr.next();
            System.out.println("Bood id: "+b.bid+" Book Name : "+b.bookName+" Book Author : "+b.authorName);
        }

    }
}

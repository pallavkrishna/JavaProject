package practice.java.examples.collections.Cursors;

import practice.RealObjects.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorCursorRemove {


    public static void main(String[] args) {
        List<Book> list=new ArrayList();
        list.add(new Book(123,"selenium","abc"));
        list.add(new Book(124,"java","cde"));
        list.add(new Book(125,"sql","efg"));
        ListIterator <Book> bLI=list.listIterator();
        System.out.println(list);
        while (bLI.hasNext()){
            Book b=  bLI.next();
            if(b.bid==123)
                bLI.remove();

            if(b.authorName.equals("cde")){
                bLI.remove();
            }


        }
        for(Book printBook:list)
        {
            System.out.println(printBook.bid+","+printBook.bookName+","+printBook.authorName);
        }
    }

}


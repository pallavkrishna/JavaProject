package practice.java.examples.collections.Cursors;

import practice.RealObjects.Book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorCursor {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("abc");
        arrayList.add("cde");
        arrayList.add("45");
        Iterator i = arrayList.iterator();
       /* while (i.hasNext()) {
            String s = (String) i.next();
            System.out.println(s);
        }*/
        while (i.hasNext()) {
            String s = (String) i.next();
            System.out.println(s);
        }
        Iterator<String> i1 = arrayList.iterator();
        while (i1.hasNext()) {
            String s = i1.next();
            System.out.println(s);
        }
        ArrayList<Book> list=new ArrayList<>();
        list.add(new Book(123,"selenium","abc"));
        list.add(new Book(124,"java","cde"));
        list.add(new Book(125,"sql","efg"));

        list.add(new Book(126,"adv sql","efg"));
        Iterator<Book> bLI=list.iterator();

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

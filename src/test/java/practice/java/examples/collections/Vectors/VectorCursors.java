package practice.java.examples.collections.Vectors;

import practice.RealObjects.Products;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorCursors {

    public static void main(String[] args) {
        // Enumeration Cursor
        Vector <Products> productsVector=new Vector<>();
        productsVector.add(new Products(123,"pen",10.0));
        productsVector.add(new Products(456,"pencil",10.0));
        productsVector.add(new Products(788,"eraser",10.0));

        Enumeration<Products> productsEnumeration=productsVector.elements();
        System.out.println("Enumeration cursor");
        while (productsEnumeration.hasMoreElements()){
            Products products=productsEnumeration.nextElement();

            System.out.println(products.id+" "+products.name+ " " +products.cost);

        }
        Iterator<Products> productsIterator=productsVector.iterator();
        System.out.println("Iterator cursor");
        while (productsIterator.hasNext()){
            Products products=productsIterator.next();
            System.out.println(products.id+" "+products.name+ " " +products.cost);
        }
        ListIterator<Products> productsListIterator=productsVector.listIterator();
        System.out.println("ListIterator cursor");
        while (productsListIterator.hasNext()){
            Products products=productsListIterator.next();
            System.out.println(products.id+" "+products.name+ " " +products.cost);
        }
    }
}

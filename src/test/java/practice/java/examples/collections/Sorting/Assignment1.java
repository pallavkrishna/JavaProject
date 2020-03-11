package practice.java.examples.collections.Sorting;

import practice.RealObjects.Products;
import practice.java.examples.collections.Comparator.ProductIdComparator;
import practice.java.examples.collections.Comparator.ProductNameComparator;

import java.util.LinkedList;

public class Assignment1 {
    public static void main(String[] args) {
        LinkedList<Products> pll=new LinkedList<>();
        pll.add(new Products(475,"book",100));
        pll.add(new Products(145,"pen ",20));
        pll.add(new Products(78,"ear phones",1000));
        pll.add(new Products(899,"laptop",5510));
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Before sorting ");
       // pll.forEach((Products value)-> System.out.println(value.id +" " +value.name+" "+value.cost ));
        for(Products print :pll)
            System.out.println("product id: "+print.id+ " productName: "+ print.name+ " productCost: "+print.cost);
        pll.sort(new ProductIdComparator());
        System.out.println("after sorting ");
        for(Products print :pll)
            System.out.println("product id: "+print.id+ " productName: "+ print.name+ " productCost: "+print.cost);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Before sorting ");
        // pll.forEach((Products value)-> System.out.println(value.id +" " +value.name+" "+value.cost ));
        for(Products print :pll)
            System.out.println("product id: "+print.id+ " productName: "+ print.name+ " productCost: "+print.cost);
        pll.sort(new ProductNameComparator());
        System.out.println("after sorting ");
        for(Products print :pll)
            System.out.println("product id: "+print.id+ " productName: "+ print.name+ " productCost: "+print.cost);

    }
}

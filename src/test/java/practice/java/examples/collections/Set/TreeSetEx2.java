package practice.java.examples.collections.Set;

import practice.RealObjects.Products;
import practice.java.examples.collections.Comparator.ProductIdComparator;

import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet <Products> productsTreeSet=new TreeSet<>(new ProductIdComparator());
        productsTreeSet.add(new Products(123,"book",15.0));
        productsTreeSet.add(new Products(456,"bottle",10.0));
        productsTreeSet.add(new Products(785,"pen",128.8));
        for(Products p :productsTreeSet){
            System.out.println( "Product id :"+p.id
                    +" product name: "+p.name
                    + " product cost: "+p.cost);
        }
    }
}

package practice.java.examples.collections.Comparator;

import practice.RealObjects.Products;

import java.util.Comparator;

public class ProductIdComparator implements Comparator<Products> {
    @Override
    public int compare(Products o1, Products o2) {
        return Integer.compare(o1.id, o2.id);
    }


}

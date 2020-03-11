package practice.java.examples.collections.Comparator;

import practice.RealObjects.Products;

import java.util.Comparator;

public class ProductNameComparator implements Comparator<Products> {
    @Override
    public int compare(Products o1, Products o2) {

        return -o1.name.compareTo(o2.name);
    }


}

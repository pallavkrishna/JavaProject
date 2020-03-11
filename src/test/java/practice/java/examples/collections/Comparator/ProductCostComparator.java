package practice.java.examples.collections.Comparator;

import practice.RealObjects.Products;

import java.util.Comparator;

public class ProductCostComparator implements Comparator<Products> {
    @Override
    public int compare(Products o1, Products o2) {
        return Double.compare(o1.cost, o2.cost);
    }


}

package practice.java.examples.collections.Comparator;

import practice.RealObjects.Emp;

import java.util.Comparator;

public class EmpNameComparator implements Comparator<Emp> {


    @Override
    public int compare(Emp o1, Emp o2) {
       return o1.name.compareTo(o2.name);
    }
}

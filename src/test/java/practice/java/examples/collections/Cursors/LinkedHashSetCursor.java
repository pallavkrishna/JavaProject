package practice.java.examples.collections.Cursors;

import practice.RealObjects.Emp;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetCursor {

    public static void main(String[] args) {
        LinkedHashSet<Emp> lHSet=new LinkedHashSet<>();
        lHSet.add(new Emp(123,"leon",780.8));
        lHSet.add(new Emp(456,"miller",670.8));
        lHSet.add(new Emp(789,"bill",987.8));
        lHSet.removeIf(emp -> emp.sal > 700.0);
        for(Emp print :lHSet)
            System.out.println(print.id+" "+print.name+" "+print.sal);
    }
}

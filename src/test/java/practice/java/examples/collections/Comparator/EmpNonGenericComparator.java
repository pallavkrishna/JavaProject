package practice.java.examples.collections.Comparator;

import practice.RealObjects.Emp;

import java.util.Comparator;

public class EmpNonGenericComparator implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        Emp e1=(Emp)o1;
        Emp e2=(Emp)o2;
        if(e1.id==e2.id){
            return 0;
        }
        else if(e1.id>e2.id){
            return 1;

        }
        else {
            return -1;
        }
    }
}

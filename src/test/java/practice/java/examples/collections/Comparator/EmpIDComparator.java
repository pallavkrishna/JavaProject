package practice.java.examples.collections.Comparator;

import practice.RealObjects.Emp;

import java.util.Comparator;

public class EmpIDComparator implements Comparator<Emp> {


    @Override
    public int compare(Emp o1, Emp o2) {
        if(o1.id==o2.id){
            return 0;
        }
        else if(o1.id>o2.id){
            return 1;

        }
        else {
            return -1;
        }
    }
}

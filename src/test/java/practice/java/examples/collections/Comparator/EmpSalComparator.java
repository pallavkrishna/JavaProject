package practice.java.examples.collections.Comparator;

import practice.RealObjects.Emp;

import java.util.Comparator;

public class EmpSalComparator implements Comparator<Emp> {


    @Override
    public int compare(Emp o1, Emp o2) {
        if(o1.sal==o2.sal){
            return 0;
        }
        else if(o1.sal>o2.sal){
            return 1;

        }
        else {
            return -1;
        }
    }
}

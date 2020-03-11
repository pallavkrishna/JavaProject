package practice.java.examples.collections.Sorting;

import practice.RealObjects.Emp;
import practice.java.examples.collections.Comparator.EmpIDComparator;
import practice.java.examples.collections.Comparator.EmpNameComparator;
import practice.java.examples.collections.Comparator.EmpNonGenericComparator;
import practice.java.examples.collections.Comparator.EmpSalComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Example4Enhancement {

    public static void main(String[] args) {
        ArrayList<Emp> al=new ArrayList<>();
        al.add(new Emp(147,"lard",456.0));
        al.add(new Emp(1,"pard",560.8));
        al.add(new Emp(200,"kard",250.));
        al.add(new Emp(8042267,"prot",143.7));
        System.out.println("Using Non Generic Emp ID Comparator");

        System.out.println("Using Emp ID Comparator");
        System.out.println("Before soring:");
        for(Emp print:al){
            System.out.println("Emp id : "+print.id+" Emp name : "+print.name+" Emp sal : "+print.sal);
        }
        al.sort(new EmpIDComparator());
        System.out.println("After sorting :");
        for(Emp print:al){
            System.out.println("Emp id : "+print.id+" Emp name : "+print.name+" Emp sal : "+print.sal);
        }
        System.out.println("------------------------------------------------------");
        System.out.println("Using Emp Name Comparator");
        System.out.println("Before soring:");
        for(Emp print:al){
            System.out.println("Emp id : "+print.id+" Emp name : "+print.name+" Emp sal : "+print.sal);
        }
        al.sort(new EmpNameComparator());
        System.out.println("After sorting :");
        for(Emp print:al){
            System.out.println("Emp id : "+print.id+" Emp name : "+print.name+" Emp sal : "+print.sal);
        }
        System.out.println("------------------------------------------------------");
        System.out.println("Using Emp salary Comparator");
        System.out.println("Before soring:");
        for(Emp print:al){
            System.out.println("Emp id : "+print.id+" Emp name : "+print.name+" Emp sal : "+print.sal);
        }
        al.sort(new EmpSalComparator());
        System.out.println("After sorting :");
        for(Emp print:al){
            System.out.println("Emp id : "+print.id+" Emp name : "+print.name+" Emp sal : "+print.sal);
        }
        System.out.println("------------------------------------------------------");
    }
}

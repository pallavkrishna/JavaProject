package practice.java.examples.collections.Sorting;

import practice.RealObjects.Employee;
import practice.RealObjects.EmployeeGeneric;

import java.util.ArrayList;
import java.util.Collections;

public class Example3 {

    public static void main(String[] args) {
        ArrayList<EmployeeGeneric> eal=new ArrayList<>();
        eal.add(new EmployeeGeneric(1000,"pallav",390000.0));
        eal.add(new EmployeeGeneric(46,"krishna",490000.0));
        eal.add(new EmployeeGeneric(5,"jhon",2000.0));
        eal.add(new EmployeeGeneric(2,"paorn",180000.0));
        System.out.println("Before Sorting ");
        for(EmployeeGeneric emp :eal){
            System.out.println("id ->"+emp.id +" name ->"+ emp.name +" sal ->"+emp.sal);
        }
        Collections.sort(eal);
        System.out.println("After Sorting ");
        for(EmployeeGeneric emp :eal){
            System.out.println("id ->"+emp.id +" name ->"+ emp.name +" sal ->"+emp.sal);
        }
    }
}

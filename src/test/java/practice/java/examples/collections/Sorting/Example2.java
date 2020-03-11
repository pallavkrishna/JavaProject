package practice.java.examples.collections.Sorting;

import practice.RealObjects.Employee;

import java.util.ArrayList;
import java.util.Collections;

public class Example2 {

    public static void main(String[] args) {
        ArrayList<Employee> eal=new ArrayList<>();
        eal.add(new Employee(1000,"pallav",390000.0));
        eal.add(new Employee(46,"krishna",490000.0));
        eal.add(new Employee(5,"jhon",2000.0));
        eal.add(new Employee(2,"horn",180000.0));
        System.out.println("Before Sorting ");
        for(Employee emp :eal){
            System.out.println("id ->"+emp.id +" name ->"+ emp.name +" sal ->"+emp.sal);
        }
        Collections.sort(eal);
        System.out.println("After Sorting ");
        for(Employee emp :eal){
            System.out.println("id ->"+emp.id +" name ->"+ emp.name +" sal ->"+emp.sal);
        }
    }
}

package practice.RealObjects;

public class EmployeeGeneric implements Comparable<EmployeeGeneric> {
    public int id;
    public String name;
    public double sal;
      public EmployeeGeneric(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }


    @Override
    public int compareTo(EmployeeGeneric e) {
           return name.compareTo(e.name);
    }
}

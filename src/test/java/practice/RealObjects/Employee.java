package practice.RealObjects;

public class Employee implements Comparable {
    public int id;
    public String name;
    public double sal;
      public Employee(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    @Override//using emp id
    public int compareTo(Object o) {
          Employee e=(Employee) o;
          if(id==e.id)
              return 0;
          else if(id>e.id)
              return 1;
          else return -1;
    }
}

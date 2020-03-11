package practice.java.examples.inheritance;

import org.testng.annotations.Test;

public class IsAInheritanceChild extends IsAInheritanceParent
{


   public void child(){
       super.s="child";
       print();
   }
  /*  @Test
    public void main() {

        super.print();
        this.print();
    }*/

}

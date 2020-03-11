package practice.java.examples.inheritance;

public class ExecutionClass {

    public static void main(String[] args) {
        IsAInheritanceParent parent = new IsAInheritanceParent();
        IsAInheritanceChild child = new IsAInheritanceChild();
        child.s = "apple";
        child.print();
        child.child();
        parent.print();
    }
}

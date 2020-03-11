package practice.java.examples.General;

public class TestPrivateAccessSpecifier {
    static PrivateAccessSpecifierExample pase=null;
    public static void main(String[] args) {
        pase= new PrivateAccessSpecifierExample();
        System.out.println("before update"+pase.read());
        pase.write(45);
        System.out.println("after update"+pase.read());

    }
}

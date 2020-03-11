package practice.java.examples.General;

public class PrivateAccessSpecifierExample {
    private int a;
    public int read(){
     return a;

    }
    public void write(int a){
        this.a=a;
    }

}

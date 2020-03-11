package practice.java.examples.General;

public class FibnoacciSeries {
    public static void main(String[] args) {
        int start =0;
        int next=1,out;
        for(int i=1;i<10;i++){

            System.out.println(i+"->"+next);
            out=start+next;
            start=next;
            next=out;
        }
    }
}

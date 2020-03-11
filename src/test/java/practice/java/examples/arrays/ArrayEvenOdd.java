package practice.java.examples.arrays;

import java.util.Scanner;

public class ArrayEvenOdd {

	public static void main(String[] args) {
		
		int n[];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: \n ");
		n = new int [sc.nextInt()];
		System.out.println("Size of array is :"+n.length);
		for(int index=0;index<=n.length-1;index++) {
			//n[index]=index;
			n[index]=sc.nextInt();
		}
		for(int index=0;index<=n.length-1;index++) {
			if(n[index]%2==0) {
				System.out.println(n[index] +"is even");
			}
		}
		

	}

}

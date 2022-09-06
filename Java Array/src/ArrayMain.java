import java.util.Scanner;

import com.array.java.Calculate;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no of array u want : ");
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter " + n + " elements of the Array : ");
		for(int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
//			System.out.println(" ");
		}sc.close();
		
		System.out.println("The Matrix is : ");
		for(int value: a) {
			System.out.println(value);
		}
		
		Calculate ob = new Calculate(a,n);
		ob.sum();
		ob.sum(a);
		ob.sum(a,n);
	}

}

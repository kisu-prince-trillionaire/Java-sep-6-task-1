package com.array.java;

public class Calculate {
	int a[];
	int n;

	public Calculate(int[] a, int n) {
		this.a = a;
		this.n = n;
	}

	public int[] getA() {
		return a;
	}

	public void setA(int[] a) {
		this.a = a;
	}
	
	public void sum() {
		int sum = 0;
		for(int i = 0; i <n; i++) {
			sum = sum + a[i];
		}
		System.out.println("The sum of an array is : " + sum);
	}
	
	public void sum(int a[]) {
		int even = 0 ;
		for(int i = 0; i <n; i++) {
			if(a[i] % 2 == 0) {
				even = even + a[i];
			}
		}
		System.out.println("The sum of even elements of an array is : " + even);
	}
	
	public void sum(int a[],int n) {
		int odd = 0 ;
		for(int i = 0; i <n; i++) {
			if(a[i] % 2 != 0) {
				odd = (int) (odd + a[i]);
			}
		}
		System.out.println("The sum of odd elements of an array is : " + odd);
	}

}

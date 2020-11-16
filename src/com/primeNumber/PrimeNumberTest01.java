package com.primeNumber;

import java.util.Scanner;

public class PrimeNumberTest01 {

	public static void main(String[] args) {
	System.out.println("Enter a Number");
	Scanner scn = new Scanner(System.in);
	int n=scn.nextInt();
	FindPrimeNo(n);
	}
	static void FindPrimeNo(int num) {
	int count=0;
	for(int i=1;i<=100;i++) {
	if(num%i==0) {
	count++;	
	}	
	}
	if(count==2) {
	System.out.println("prime Number");	
	
	}
	else {
		System.out.println("Not a Prime No");
	}
	}
}

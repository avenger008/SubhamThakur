package com.muraai;

import java.util.Scanner;

public class FibonacciSeries {
	static int firstValue=0;
	
	public static void main(String[] args) {
		 
		 Scanner scn = new Scanner(System.in);
		 System.out.println("please enter firstNumber");
		 int from =scn.nextInt();
	     System.out.println("you have entered ::"+from);
	      
	      System.out.println("please enter secondNumber"); 
	      int upto =scn.nextInt();
	      System.out.println("you have entered ::"+upto);
	      
	      System.out.println(fibon(from,upto));
	      
	     
	}
	static int fibon(int from,int upto){
	      for(int i=from;i<=upto;i++) {}
	        int cons1=from;
	        int cons2=cons1+1;
	        int third=cons1+cons2;
	        int first=cons2;
	        
	        
	        
	        
	        
			return third;
	        
	       }
	      
	      
	}
		


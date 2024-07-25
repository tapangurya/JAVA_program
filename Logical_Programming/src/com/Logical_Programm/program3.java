package com.Logical_Programm;

import java.util.Scanner;

public class program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		AmstrongNumber(num);
	}

	private static void AmstrongNumber(int num) {
		int copy= num;
		int amstrong=0;
		while(num!=0) {
			int rem = num%10;
			int cal=calculate(rem,copy);
			amstrong= amstrong+cal;
			num/=10;
		}
		if(amstrong==copy) {
			System.out.println("Amstron number");
		}
		else
		{
			System.out.println("Not an amstrong number");
		}
		
	}

	public static int calculate( int rem , int num) {
		
		int count=0;
		while(num!=0) {
			num/=10;
			count++;
			
		}
		int total =1;
		for(int i=1; i<=count; i++) {
			total= total*rem;
		}
		return total;
		
	}
}

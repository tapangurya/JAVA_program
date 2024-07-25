package com.Logical_Programm;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		happyNumber(num);
	}

	private static void happyNumber(int num) 
	{

			int sum=0;
			while (num!=0) {
				int rem=num%10;
				sum=sum+(rem*rem);
				num/=10;
			}
			if(sum>=10) {
				happyNumber(sum);
			}
			else if(sum==1) {
				System.out.println("it is happy number");
			}
			else {
				System.out.println("it is not a happy number");
			}
	}
	
}

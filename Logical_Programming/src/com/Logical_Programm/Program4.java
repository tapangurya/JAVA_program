package com.Logical_Programm;

import java.util.Iterator;
import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);	
		int num = sc.nextInt();
		Primenumber(num);
	}

	public static void Primenumber(int num) {
		int count=2;
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) 
			{
				count++;
			}
			
		}
		if(count ==2) {
			System.out.println("prime Number");
		}
		else {
			System.out.println("Not a prime number");
		}
	}
}

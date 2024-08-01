package com.Pattern;
/*
            1    
		   212   
		  32123  
		 4321234 
		543212345

 */
import java.util.Scanner;
class pattern39{
public static void pattern(int num) {
	for(int row=1;row<=num;row++) {
		int i =2;
		for(int col = 1; col<=(num*2-1);col++) {
			if(col==num) {
				System.out.print(1);
			}
			else if(row+col>=num+1 && col-row<=num-1 ) {
				if(col<num) {
					System.out.print((num-col)+1);
				}
				else{
					System.out.print(i++);
				}
			}

			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	
}
public static void main(String[] args) {
	pattern(5);
}

}

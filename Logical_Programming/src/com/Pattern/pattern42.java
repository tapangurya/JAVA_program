package com.Pattern;
/*
 		        5    
			   454   
			  34543  
			 2345432 
			123454321
 */
public class pattern42 {
	public static void pattern(int num) {
		for(int row=1;row<=num;row++) {
			int i =2;
			for(int col = 1; col<=(num*2-1);col++) {
				if(col==num) {
					System.out.print(col);
				}
				else if(row+col>=num+1 && col-row<=num-1) {
					if(col<num) {
						System.out.print(col);

					}
					else {
						System.out.print(col-i);
						i+=2;
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

package ArrayProgram;

public class program9 {
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,4};
		int fact = 1;
		
		for(int i=0; i<arr.length;i++)
		{ 
			fact = fact*arr[i];
			System.out.println(fact);
			
		}
		
	}  

}

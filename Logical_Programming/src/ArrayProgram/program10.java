package ArrayProgram;
	// The following array it is indicating the age of Raju, Ram Rohit, in sequentiol order
// i fthe age<10  AND if it is even -> find the qube of that age.

public class program10 {
	public static void main(String[] args) 
	{
		int [] arr = {10,6,22};
		int fact = 1;
		
		for(int i=0; i<arr.length;i++)
		{ 
			if(arr[i]<=10 || arr[i]%2==0)
			{
				System.out.println((int)Math.pow(arr[i], 3));
			}
			
			else if(arr[i]>=10 && arr[i]<15)
			{
				System.out.println(Math.pow(arr[i], 2));
			}
			else if(arr[i]>20)
			{
				System.out.println(arr[i]);
			}
			
		}
		
	}  
	

}

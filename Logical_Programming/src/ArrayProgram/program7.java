package ArrayProgram;
	// find the qube of each and every element in the array
public class program7 {
	public static void main(String[] args) 
	{
		int [] arr = {10,15,11,20,30};
		for(int index =0; index<arr.length;index++)
		{
			System.out.println((int) Math.pow(arr[index], 3));
		}
	}
}

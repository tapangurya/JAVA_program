package ArrayProgram;
//WAP TO fiend sum of all  even index  number
public class program5 {
	public static void main(String[] args) {
		int [] arr = {10,25,5,96,4,25};
		int sum =0;
		for(int i=0; i<arr.length; i++) {
			
			if(i%2==0)
			{
				sum=sum+arr[i];
			}
				
			
		}
		System.out.println(sum);

	}
}

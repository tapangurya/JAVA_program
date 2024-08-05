package ArrayProgram;
		 // wap to find the sum of each and ever even number
public class program6 {
	public static void main(String[] args) {
		int [] arr = {10,15,11,20,30};
		int sum=0;
		for(int index =0; index<arr.length;index++)
		{
			if(arr[index]%2==0)
			{
				sum+=arr[index];
			}
			
		}
		System.out.println(sum);
	}

}

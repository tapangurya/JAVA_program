package ArrayProgram;
/*
 array1={20,30},70
 array2={1015,20},
 array3 ={},
 */
public class HW1 
{
	public static void main(String[] args) {
		int [] arr1 = {20,30,40};
		int [] arr2 = {10,40,25};
		int [] arr3 = {15,50,40};
		int commonElemnt=findCommonelement(arr1, arr2, arr3);
		System.out.println("Common Element: "+commonElemnt);
		int []new1=multiply(arr1, commonElemnt);
		int []new2=multiply(arr2, commonElemnt);
		int []new3=multiply(arr3, commonElemnt);
		System.out.println("output of 1st array After multiply with common element: ");
		print(new1);
		System.out.println("output of 2nd array After multiply with common element: ");
		print(new2);
		System.out.println("output of 3rd array After multiply with common element: ");
		print(new3);
		findGratest(new1);
		findGratest(new2);
		findGratest(new3);             
	
	}
	public  static int findCommonelement(int []arr1, int []arr2,int []arr3) {
		int commonElemnt=0;
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				for(int k=0; k<arr3.length; k++)
				{
					if(arr1[i]==arr2[j] && arr1[i]==arr3[k] && arr2[j]==arr3[k])
					{
						commonElemnt=arr1[i];						
  						
					}
				}
			}
		}
		return commonElemnt;
	}
	public static  int[] multiply(int [] a,int comm)
	{
		int [] n=new int[a.length];
		for(int i=0; i<a.length;i++)
		{
			n[i]=a[i]*comm;
		}
		return n;
	}
	public static void print(int []a) {
		for(int i =0; i< a.length; i++)
		{
			System.out.print(a[i]+" , ");
		}
		System.out.println();
	}
	public static void findGratest(int [] a)
	{
		int sum=0;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]+a[j]>sum)
				{
					sum= a[i]+a[j];
					
				}
			}
			
		}
		System.out.println(sum);
	}
	

}

package ArrayProgram;

public class HW2 
{
	public static void main(String[] args) {
		 int[] arr = {1, 2, 7, 8, 9, 6};
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(checkPrime(arr[i])+" ");
	            
	        }
		
	}
	public static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}

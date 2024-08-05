package ArrayProgram;
// write a program prient even index of value
public class program2 {
public static void main(String[] args) {
	int [] arr = {10,25,487,96,47,25};
	for(int i=0; i<=arr.length; i++) {
		if(i%2==0)
		{
			System.out.println(arr[i]);
		}
	}
}
}

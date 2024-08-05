package ArrayProgram;
// write a program print odd index of value
public class program3 {
public static void main(String[] args) {
	int [] arr = {10,25,487,96,47,25};
	for(int i=0; i<=arr.length-1; i++) {
		if(i%2==1)
		{
			System.out.println(arr[i]);
		}
	}
}
}

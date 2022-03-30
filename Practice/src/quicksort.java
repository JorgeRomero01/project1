import java.util.Arrays;

public class quicksort {
	public static void main (String[] args) {
		int arr[] = {10, 5, 20, 21, 15, 50, 31, 1, 55,39};
		int n = arr.length;
		
		practice1 quick = new practice1();
		quick.quicksort(arr, 0, n-1);
		System.out.print(Arrays.toString(arr));
		System.out.println();
		
		
		
	}
}

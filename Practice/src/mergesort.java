import java.lang.reflect.Array;

public class mergesort {
	public static void main(String[] args) {
	int[] arr = {10, 5, 20, 21, 15, 50, 31, 1, 55,39};
	mergesort2(arr);
	for(int j = 0; j < arr.length; j++) {
		System.out.print(arr[j] + " ");
	}
	}

public static void mergesort2(int[] arr) {
	int arraylength = arr.length;
	if(arraylength <= 1) {	//base case
		return;
	}
	int middle = arraylength / 2;
	int[] leftarray = new int [middle];
	int[] rigtharray = new int[arraylength - middle]; 
	
	int l = 0;	//left array
	int r = 0;	//right array
	
	for(;l < arraylength; l++) {
		if(l < middle) {
			leftarray[l] = arr[l];
		}
		
		else {
			rigtharray[r] = arr[l];
			r++;
		}	
	}
	
	mergesort2(leftarray);
	mergesort2(rigtharray);
	merge(leftarray, rigtharray, arr);
	
	}
public static void merge(int[] leftarray, int[] rigtharray, int[] arr){
	int leftsize = arr.length/2;
	int rightsize = arr.length - leftsize;
	int i = 0, l = 0, r = 0;
	
	while(l < leftsize && r < rightsize) {
		if(leftarray[l] < rigtharray[r] ) {
			arr[i] = leftarray[l];
			i++;
			l++;
		}
		else {
			arr[i] = rigtharray[r];
			i++;
			r++;
		}
	}
	while(l < leftsize) {
		arr[i] = leftarray[l];
		i++;
		l++;
	}
	while(r < rightsize) {
		arr[i] = rigtharray[r];
		i++;
		r++;
	}
}

}
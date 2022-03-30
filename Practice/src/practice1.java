import java.util.*; 

public class practice1 {


	public void quicksort(int arr[], int start, int end) {
		if(start < end) {
			int partitionIndex = partition(arr, start, end);
		
		quicksort(arr, start, partitionIndex-1);
		quicksort(arr, partitionIndex+1, end);
		}
	}
	
	public int partition(int arr[], int start, int end) {
		int pivot = arr[end]; //set pivot to end 
		int i = start - 1; //smaller element index
		
		for(int j = start; j < end; j++) {
			if(arr[j] <= pivot) {	//check if current element is less thn or equal to pivot
					i++;
					
					int temp = arr[i];	//swap arr[i] and arr[j] 
					arr[i] = arr[j];
					arr[j] = temp;
			}
		}
		
		int temp = arr[i + 1];	//swap arr[i + 1] and arr[end]
		arr[i + 1] = arr[end];
		arr[end] = temp;		
		return i + 1;
		
	}
}


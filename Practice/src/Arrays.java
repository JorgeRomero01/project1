	import java.io.*;
	import java.util.Random;
	import java.util.Scanner;
	import java.util.Arrays;

	public class Arrays {
	

		/*
		 * public static boolean check(String letters) { int x = 0; int o = 0; for(int i
		 * = 0; i < letters.length(); i++) { if(letters.charAt(i) == 'x' ||
		 * letters.charAt(i) == 'X') { x++; } else if(letters.charAt(i) == 'o' ||
		 * letters.charAt(i) == 'O') { o++; } else if(letters.charAt(i) != 'x' ||
		 * letters.charAt(i) != 'o' || letters.charAt(i) != 'X' || letters.charAt(i) !=
		 * 'O') { return false; } } return x == o; }
		 * 
		 * public static void main(String[] args) { System.out.print(check("xxoXoO"));
		 * System.out.print("\n"); System.out.print(check("xoxXOoO")); }
		 */

		/*
		 * public static int countWords(String s) { int counter = 0; for(String words:
		 * s.split(" ")){ //System.out.println(words); counter++; }
		 * //System.out.print(counter + "\n"); return counter;
		 * 
		 * } public static void main(String args[]) {
		 * System.out.print(countWords("Hello hi hey")); }
		 */

		
		/*
		 * public static int[] twoSum(int[] nums, int target) { int a[]=new int[2]; int
		 * sum = 0; int start = 0; int end = 0; for(int i = 0; i < nums.length; i++){
		 * for(int k = i + 1; k < nums.length; k++) { if(sum != target) {
		 * sum=nums[i]+nums[k]; start=i; end=k; } else { break; } } } a[0]=start;
		 * a[1]=end;
		 * 
		 * return a; }
		 * 
		 * public static void main(String[] args) { int[] nums = {3,2,4};
		 * System.out.print(Arrays.toString(twoSum(nums, 6))); }
		 */
		  
		/*
		 * public static int romanToInt(String s) { int final_value = 0;
		 * 
		 * for(int i = 0; i < s.length(); i++) { char index = s.charAt(i);
		 * 
		 * switch(index) {
		 * 
		 * case 'I': final_value += 1; break; case 'V': final_value += 5; if(i > 0 &&
		 * s.charAt(i -1) == 'I') { final_value = final_value - 2; break; } break;
		 * 
		 * case 'X': final_value += 10; if(i > 0 && s.charAt(i - 1) == 'I') {
		 * final_value = final_value - 2; break; } break;
		 * 
		 * case 'L': final_value += 50; if(i > 0 && s.charAt(i - 1) == 'X') {
		 * final_value = final_value - 20; break; } break;
		 * 
		 * case 'C': final_value += 100; if(i > 0 && s.charAt(i - 1) == 'X') {
		 * final_value = final_value - 20; break; } break;
		 * 
		 * case 'D': final_value += 500; if(i > 0 && s.charAt(i - 1) == 'C') {
		 * final_value = final_value - 200; break; } break;
		 * 
		 * case 'M': final_value += 1000; if(i > 0 && s.charAt(i - 1) == 'C') {
		 * final_value = final_value - 200; break; } break;
		 * 
		 * default: final_value += 0; }
		 * 
		 * 
		 * } return final_value; }
		 * 
		 * 
		 * public static void main(String[] args) {
		 * System.out.print(romanToInt("MCMXCIV")); }
		 */
		
		/*
		 * // public static int factorial(int number) { // int result = 1; // for(int i
		 * = 1; i <= number; i++) { // result = result * i; // } // return result; // }
		 * // // public static void main(String[] args) { //
		 * System.out.print(factorial(1)); // }
		 */	
		

		/*
		 * public static void even_index(int[] num) { for(int i = 2; i < num.length;
		 * i+=2) { System.out.print(num[i] + " "); } }
		 * 
		 * public static void even_element(int[] num) { for(int i = 0; i < num.length;
		 * i++) { if(num[i] % 2 == 0) { System.out.print(num[i] + " "); } }
		 * 
		 * }
		 * 
		 * public static void reverse_order(int[] num) { for(int i = 9; i >= 0; i--) {
		 * System.out.print(num[i] + " "); }
		 * 
		 * 
		 * }
		 * 
		 * public static void first_and_last(int[] num) { for(int i = 0; i <=
		 * num.length; i+=9) { System.out.print(num[i] + " "); }
		 * 
		 * 
		 * }
		 * 
		 * 
		 * public static void main(String[] args) {
		 * 
		 * int[] numbers = {5, 8 , 60, 2, 50, 45, 15, 35, 90, 31};
		 * 
		 * even_index(numbers); System.out.println(); even_element(numbers);
		 * System.out.println(); reverse_order(numbers); System.out.println();
		 * first_and_last(numbers);
		 * 
		 * 
		 * }
		 */
		

		 
		/*
		 * private int[] values;
		 * 
		 * public void ArrayMethods(int[] initialValues) { values = initialValues; }
		 * 
		 * public void swapFirstAndLast() { int first = values[0]; int last =
		 * values[values.length - 1]; values[0] = last; values[values.length - 1] =
		 * first;
		 * 
		 * }
		 * 
		 * public void shiftRight() {
		 * 
		 * int last_element = values[values.length - 1]; int[] temp = new
		 * int[values.length];
		 * 
		 * for(int i = 0; i < values.length-1; i++) { temp[i+1] = values[i]; } temp[0] =
		 * last_element;
		 * 
		 * for(int i = 0; i < values.length; i++ ) { values[i] = temp[i]; } }
		 * 
		 * public void evenElements() {
		 * 
		 * for(int i = 0; i < values.length; i++) { if(values[i] % 2 == 0) { values[i] =
		 * 0; } } }
		 * 
		 * public void replacewithLarger() {
		 * 
		 * int bigger = 0; int newbigger = 0; int[] temp = new int[values.length];
		 * temp[0] = values[0];
		 * 
		 * for(int i = 1; i < values.length - 1; i++) { if(values[i] > values[i - 1]) {
		 * bigger = values[i]; } else { bigger = values[i - 1]; } if(bigger > values[i +
		 * 1]) { newbigger = bigger; } else { newbigger = values[i + 1]; } temp[i] =
		 * newbigger; }
		 * 
		 * temp[values.length - 1] = values[values.length - 1];
		 * 
		 * for(int j = 0; j < values.length; j++) { temp[j] = values[j];
		 * 
		 * }
		 * 
		 * }
		 * 
		 * public void removeMiddle() {
		 * 
		 * if(values.length % 2 == 1) { int mid = values.length/2; values[mid] = 0; }
		 * else { int mid1 = values.length/2-1; int mid2 = values.length/2; values[mid1]
		 * = 0; values[mid2] = 0; }
		 * 
		 * 
		 * }
		 * 
		 * public void move_evenElements() { int pos = 0; int evenpos = 0;
		 * 
		 * for(int i = 0; i < values.length; i++) { if(values[i] % 2 == 0) { pos = i;
		 * int x = values[evenpos]; values[evenpos] = values[pos]; values[pos] = x;
		 * evenpos++;
		 * 
		 * } }
		 * 
		 * }
		 * 
		 * 
		 * 
		 * public static void printValues(int[] values) { for(int i = 0; i <
		 * values.length; i++) { System.out.print(values[i] + " "); } }
		 * 
		 * 
		 * 
		 * public static void main(String[] args) { int[] values = {1,4,9,16,25,34};
		 * main2 jorge = new main2();
		 * 
		 * jorge.ArrayMethods(values);
		 * 
		 * jorge.move_evenElements();
		 * 
		 * printValues(values);
		 * 
		 * 
		 * }
		 */
		
		/*
		 * public static void main(String[] args) { final int LENGTH = 100; double[]
		 * values = new double[LENGTH]; int currentSize = 0;
		 * 
		 * // Read inputs
		 * 
		 * System.out.println("Please enter values, Q to quit:"); Scanner in = new
		 * Scanner(System.in); while (in.hasNextDouble() && currentSize < values.length)
		 * { values[currentSize] = in.nextDouble(); currentSize++; }
		 * 
		 * // Find the largest value
		 * 
		 * double largest = values[0]; double smallest = values[0];
		 * 
		 * for (int i = 1; i < currentSize; i++) { if (values[i] > largest) { largest =
		 * values[i]; } else if(values[i] < smallest) { smallest = values[i]; } }
		 * 
		 * for (int i = 0; i < currentSize; i++) { System.out.print(values[i]); if
		 * (values[i] == largest) { System.out.print(" <== largest value"); } else
		 * if(values[i] == smallest) { System.out.print(" <== smallest value"); }
		 * System.out.println(); } }
		 */	

		public int sumWithoutSmallest(int[] arr) {
			int smallest = arr[0];
			int sum = 0;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] < smallest) {
					smallest = arr[i];
				}
				else {
					sum = sum + arr[i];
				}
				
			}
			return sum - smallest;
		}


		//7.6
		public int alternatingsum(int[] arr) {
			int sum = 0;
			for(int i = 0; i < arr.length; i++) {
				if(i % 2 == 1) {
					sum = sum - arr[i];
				}
				else{
					sum = sum + arr[i];
				}
			}
			return sum;
		}
		
		
		//7.7
		public void alternating(int[] arr) {
			for(int i = arr.length-1; i >= 0; i--) {
				System.out.print(arr[i] + " ");
			}
		}
		
		//7.8
		public void permutations() {
			int[] permArray = new int[10];
			int[] tempArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			int currentsize = tempArray.length;
			int i = 0;
			
			while(currentsize != 0) {
				 int rnd = (int)(Math.random()*10);
				 if(rnd < currentsize) {
				 permArray[i] = tempArray[rnd];
				 tempArray[rnd] = tempArray[currentsize-1];
				 currentsize = currentsize - 1;
				 i++;
				 }
			}
			System.out.print(Arrays.toString(permArray));
			
	 	}
		
		//7.13
		public void sortrandom() {
			int[] values = new int[20];
			for(int i = 0; i < values.length; i++) {
				int rnd = (int)(Math.random()*99);
				values[i] = rnd;
			}
			System.out.print(Arrays.toString(values));
			System.out.println();
			
			Arrays.parallelSort(values);
			System.out.print(Arrays.toString(values));
		}
	
		
		
		public static void main(String[] args) {
			int[] values = {5, 8, 20, 90, 16, 51, 33};
			Arrays jorge = new Arrays();
			System.out.print(jorge.sumWithoutSmallest(values));
			System.out.println();
			System.out.print(jorge.alternatingsum(values)); //7.6
			System.out.println();
			jorge.alternating(values); //7.7
			System.out.println();
			jorge.permutations(); //7.8
			System.out.println();
			jorge.sortrandom(); //7.13
			
		
		}	

	}




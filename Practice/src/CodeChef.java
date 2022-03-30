import java.util.Scanner;
import java.util.*; 

public class CodeChef {
	public static void main(String[] args) {
		int airports[] = {10, 5, 20, 21, 15, 50, 31, 1, 55,39};
		Scanner scanner = new Scanner(System.in);
		int t, x,k;		
		t = scanner.nextInt();
		for(int i = 0; i < t; i++) {
			k = scanner.nextInt();
			x = scanner.nextInt();
			System.out.println(k - x);
		}
		
		
		
			
		
		
		
	}
	
	public static String findAirportCode (String tofind, Airport[] airports) {
		int index = 0;
		while(index < airports.length) {
			Airport a = airports[index];
			if(tofind.equals(airports[index])) {
				return airportcode;
			}
			else {
				index++;
			}
			
		}
		return null;
	}
}

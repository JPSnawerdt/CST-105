/**
  My name is John Snawerdt and all of this work is my own.
 */
import java.util.*;
public class FiveDigitInteger {
	
	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//prompt user to input integer
		System.out.println("Please Input a 5 Digit Integer");
		int workingint = input.nextInt();
		int digit1;
		int digit2;
		int digit3;
		int digit4;
		int digit5;
		digit1 = workingint/10000;
		digit2 = (workingint % 10000) / 1000;
		digit3 = (workingint % 1000) / 100;
		digit4 = (workingint % 100) / 10;
		digit5 = (workingint % 10);
		int sum;
		sum= digit1 + digit2 + digit3 + digit4 + digit5;
		
		System.out.println("The sum of digits " + digit1 + " + "
				+ digit2 + " + " + digit3 + " + " + digit4 + " + " 
				+ digit5 + " is = " + sum);
		
		
		
	}

}

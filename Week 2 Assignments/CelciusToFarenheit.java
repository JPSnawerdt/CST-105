/** My name is John Snawerdt and this work is my own */
import java.util.*;
public class CelciusToFarenheit {
	public static void main(String[] args) {
		//create scanner
		Scanner input= new Scanner(System.in);
		
		//prompt user for farenheit
		System.out.println("Enter a temperature in Farenheit");
		double farenheittemp = input.nextDouble();
		double ftoc = (farenheittemp- 32)*5/9;
		System.out.println(farenheittemp + "F is equal to " + ftoc +
				"C.");
		System.out.println("Enter a temperature in Celcius");
		double celciustemp = input.nextDouble();
		double ctof = celciustemp*9/5+32;
		System.out.println(celciustemp + "C is equal to " + ctof +
				"F.");
	}

}

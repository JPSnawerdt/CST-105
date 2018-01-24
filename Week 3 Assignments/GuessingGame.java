/** My name is John Snawerdt and this work is my own */

import java.util.*;
public class GuessingGame {
	public static void main(String[] args) {
		//define random variable and upper/lower bound for variable
		int randomint;
		int guessedint = 0;
		int lowerbound = 1;
		int upperbound = 10000;
		//define new random from java.util.random
		
		Random rand= new Random();
		randomint = rand.nextInt(10000) + 1;
		Scanner input = new Scanner(System.in);
		while(guessedint != randomint) {
		
		System.out.println("Pick a guess between "
				+ lowerbound + " and " + upperbound);
		guessedint = input.nextInt();
		if (guessedint == randomint) {
			System.out.println("CORRECT!");
			
		}
		else {
		
			if (guessedint < randomint) {
				System.out.println("HIGHER");
				lowerbound = guessedint+1;
			}
			else {
				System.out.println("LOWER");
				upperbound = guessedint-1;
			}
		}
	}
}
}	

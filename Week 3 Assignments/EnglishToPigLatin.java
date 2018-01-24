/** My name is John Snawerdt and this is my own work */
import java.util.*;
import java.io.*;
public class EnglishToPigLatin {
		
	public static void main(String[] args) throws Exception {
		//declare the list of vowels and the suffixs to add for words starting with vowel or consonant
		String listofvowels = "aeiouAEIOU";
		final String vowelsuffix = "way";
		final String consonantsuffix = "ay";
		//read input from file
		File inputfile = new File("C:\\Users\\John\\PigLatin.txt");
		Scanner input = new Scanner(inputfile);
		
		//while the file has more words check for starting with vowel or consonant
		while(input.hasNext()) {
			String workingword = input.next();
			//check the first letter of the world for a vowel
			if (listofvowels.contains(Character.toString(workingword.charAt(0)))) {
				System.out.println(workingword + "\t" + (workingword + vowelsuffix).toUpperCase());
			}
			//otherwise consonant
			else {
				String prefix;
				prefix ="";
				int count = 0;
				//while number of letters is less than word length
				while(count < workingword.length()) {
					//if the current letter is a vowel
					if(listofvowels.contains(Character.toString(workingword.charAt(count)))) {
						//subtract everything before the current letter
						String base = workingword.substring(count);
						//everything before the current letter
						prefix = workingword.substring(0, count);
						//add the first consonants to the base and add the suffix
						System.out.println(workingword + "\t" + (base + prefix + consonantsuffix).toUpperCase());
						break;
					}
					else {
						//repeat until we find a vowel
						count++;
					}
			}
		}
	}

}
}

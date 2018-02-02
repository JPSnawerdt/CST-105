/*
My Name is John Snawerdt and this work is my own.
 */
package twodarraymanipulation;

import java.io.File;
import java.util.Scanner;


public class TwoDArrayManipulation {

    public static void main(String[] args) throws Exception {
       	File inputfile = new File("C:\\Users\\John\\TwoDArray.txt");
	Scanner input = new Scanner(inputfile);
        //main 2d array
        char[][] mainarray = new char[20][45];
        int totalnumber = 40*25;
        //new 1d char array to store input
        char[] inputfilechars = new char[totalnumber];
        //count total that goes into inputfilechars from input
        int totalcount = 0;
        int index = 0;
        String outputstring ="";
        //reads input data and adds to 1d array. counts total input
        while(input.hasNext()){
            String workingword = input.next();
            //check to see if we are starting 
            if(totalcount == 0){
                for (int i =0; i < workingword.length(); i++){
                    inputfilechars[totalcount]=workingword.charAt(i);
                    totalcount++;
                }
            }
            //if we are not at the start we need to add _ for space
            else if (totalcount+workingword.length() < (totalnumber-1)){
                inputfilechars[totalcount]='_';
                totalcount++;
                for (int i =0; i < workingword.length(); i++){
                    inputfilechars[totalcount]=workingword.charAt(i);
                    totalcount++;
                }   
            }
            else{
                int remainder= (totalnumber-1) - (totalcount+workingword.length());
                for(int i=0; i< remainder; i++){
                    inputfilechars[totalcount]=workingword.charAt(i);
                    totalcount++;
                }
                
            }
        }
        // add @ to rest of the file if there is space
        if(totalcount<totalnumber){
            while(totalcount<totalnumber-1){
                inputfilechars[totalcount]='@';
                totalcount++;
            }
        }
        //testing input
        //for(int i=0; i <inputfilechars.length; i++){
        //System.out.println(inputfilechars[i]);
    
             for(int row =0; row < mainarray.length; row++){
                  for(int column =0; column < mainarray[row].length; column++){
                       if (index < inputfilechars.length) {
					mainarray[row][column] = inputfilechars[index];
					index++;
                        }

                    }
             }
             //test to make sure array looks correct
             //for(int row =0; row < mainarray.length; row++){
                  //for(int column =0; column < mainarray[row].length; column++){
                      //System.out.print(mainarray[row][column]);
                  //}
                //System.out.println();  
            // }     
             //outputs a string counting from column to row
        for (int column = 0; column <45; column++){
            for(int row =0; row < 20; row++){
                if(mainarray[row][column]== '@'){
                    //do nothing                    
                }
                else if(mainarray[row][column]== '_'){
                    outputstring += " ";
                    //add a space
                }
                else{
                    outputstring += mainarray[row][column];
                }
            }
        }
        System.out.print(outputstring);
    }
    }

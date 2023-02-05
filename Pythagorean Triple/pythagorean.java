//Andy Wang 
//9/7/2022
//Algorithms and Data Structures 
//Fall Term
//Pythagorean Triplet Problem 

import static java.lang.System.*; //imports 
import java.util.Arrays;


public class pythagorean { //class 
    public static void main (String args[]) {

        long start = System.nanoTime(); //start the timer ?
    

        for (int x = 1; x<=332; x++) { //nested loop where x = a, y = b, and z = c 
            for (int y = 2; y<=1000; y++) { //this loop iterates through the b value  
                int z = 1000 - x - y; //declare the "c" value 
                int guess = x*x+y*y; //check the sum of x squared and y squared 
                int answer = z*z; //check value of z squared 
                
                    if (guess == answer && x<y && y<z) { //compare the sum of x^2 + y^2 and if its equal to z^2


                        long end = System.nanoTime(); //stop timer 
                        long elapsedTime = end - start;  //calculate time elapsed 
                        double milliseconds = elapsedTime / 1000000; //convert nano seconds to milliseconds (doesn't really work)

                        String numberA = String.valueOf(x); //convert all ints into strings 
                        String numberB = String.valueOf(y);
                        String numberC = String.valueOf(z);
                        String intGuess = String.valueOf(guess);
                        String actualAnswer = String.valueOf(answer);
                        String convertedTime = String.valueOf(milliseconds);

                        System.out.println("A: " + numberA + " B: " + numberB + " C: " + numberC + "  --- " + intGuess + " = " + actualAnswer); //print out the values that result in the correct answer
                        System.out.println("elapsed time in nano seconds is: " + elapsedTime); //print out nanoseconds 
                        System.out.println("elapsed time in milli seconds is: " + convertedTime); //print out milliseconds 

                       
                    }   
            }   
        }   
    }
    }

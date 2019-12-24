// Charles Panter
// COS-111 Intro to Programming (COS-111-OL009)
// Average

/*

3. Write a well-documented (commented) program, “Average,” that reads in
lines from standard input with each line containing a name and three integers
and then uses “printf()” to print a table with a column of the names, the
integers, and the average of the three integers accurate to two decimal places.
The user will specify the number of names as a command-line argument and then
type in that number of names (along with three integers for each name).
[MO2.1, MO2.2]

A sample run would be as follows.

> java Average 4
Joe 3 5 2
Tim 4 1 5
Jane 6 3 2
Jack 8 3 5
<Ctrl-D>

Joe   3 5 2 3.33
Tim   4 1 5 3.33
Jane 6 3 2 3.67
Jack 8 3 5 5.33
*/
import java.util.Scanner;

public class Average{
  public static void main(String[] args) throws java.io.IOException{
    Scanner keyInput = new Scanner(System.in); // object for scanner

    //gobal variables
    int howMany = Integer.parseInt(args[0]); // how many enteries
    int loopCount = 0; //count for while loop
    String[] names = new String[5]; // variable for name
    String[] grades = new String[10]; // grade array
    String formats = "%s %s %.2f \n"; // output format
    double[] average = new double[5];//array to store average answers

    while(loopCount < howMany){ // start of while loop
      //variables to be used inside of while loop
      String inputString = keyInput.nextLine();//gets input from user
      String[] tempArray = inputString.split("\\s+"); //temp array for storing user input seperated by spaces
      double[] intArray = new double[3];//int array to put grades into
      double sum = 0.0; // variable used in math

      for(int i = 0; i < tempArray.length; i++){// for loop to process string input
        names[loopCount] = tempArray[0];//seperates the name out of the user input
        intArray[0] = Double.parseDouble(tempArray[1]); //passes the first grade to array
        sum += intArray[0];//math, adds first grade to sum
        intArray[1] = Double.parseDouble(tempArray[2]);//passes the second grade to array
        sum += intArray[1];//math, adds second grade to sum
        intArray[2] = Double.parseDouble(tempArray[3]);//passes the third grade to array
        sum += intArray[2];//math, adds third grade to sum
        grades[loopCount] = " "+tempArray[1]+" "+tempArray[2]+" "+tempArray[3]+" ";//passes all grades to String array
        average[loopCount] = sum / howMany;//math, averages grades
      } // end of for loop
      loopCount++; // counts how many while loops
    } // end of while loop
    System.out.println();
    for(int j = 0; j < howMany; j++){ // prints results to terminal
      System.out.printf(formats, names[j], grades[j], average[j]);//formated output
    }//end of for loop

  } // End of main
} // End of class

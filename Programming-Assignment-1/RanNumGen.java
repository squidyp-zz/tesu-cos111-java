// Charles Panter
// COS-111 Intro to Programming (COS-111-OL009)
// RanNumGen

/*
1. Write a well-documented (commented) program, “RanNumGen,” that takes an
integer command-line argument “n” that indicates the number of random numbers
to generate and uses the method “Math.random()” to print uniform random values
between 1 and 100 (both inclusive), and then prints the minimum and maximum
value. [MO1.1, MO1.2]

Sample runs would be as follows.

>java RanNumGen 5
67    24    31    11    80
The minimum value is 11.
The maximum value is 80.

>java RanNumGen 8
2    76    29    96    91    98    35    16
The minimum value is 2.
The maximum value is 98.
*/

public class RanNumGen{
  public static void main(String[] args){
    // variables
    double randNum;
    double maxVal = 0; //initalized variable
    double minVal = 101; //initalized variable
    int howMany = Integer.parseInt(args[0]); //takes the user input of a string casts it to an int

    //for loop
    for (int i = 0; i < howMany; i++){ // variable "i" is a counter starting at 0. the amount to count to is provided by the user in the howMany variable
      randNum = Math.random() * 100; // Math.random() is a method within Java to produce a random number which is than multiplied by 100 to move the decimal two places
      System.out.print((int) randNum + "  "); // printing the random number to the terminal after being casted to an int
      // finds minimum value and assigns it to the variable minVal
      if (minVal >= randNum){
        minVal = randNum;
      }
      // finds maximum value and assigns it to the variable maxVal
      if (maxVal <= randNum){
        maxVal = randNum;
      }
    }
    System.out.println(); // prints blank new line
    System.out.println("The minimum value is " + (int) minVal + "."); //prints to console and casts double minVal to int
    System.out.println("The maximum value is " + (int) maxVal + "."); //prints to console and casts double maxVal to int
    System.out.println(); //prints blanck new line
  }
}

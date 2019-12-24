// Charles Panter
// COS-111 Intro to Programming (COS-111-OL009)
// RelativelyPrimeArray

/*
1. Write a well-documented (commented) program, “RelativelyPrimeArray,” that
takes an integer command-line argument “n” and creates an (n+1)-by-(n+1)
Boolean array “rpa” such that rpa[i][j] (for i,j>0) is true if i and j are
relatively prime (have no common factors), and is false otherwise. It should
then output as is shown by the sample run below. If the indexes i,j (for i,j>0)
are equal, it should output a single space. If the indexes are not equal,
then it should output a "T" character if the array element specified by the
indexes is true or an "F" character if it is false.  [MO2.1, MO2.2]

A sample run would be as follows.

	> java RelativelyPrimeArray 9
	   1 2 3 4 5 6 7 8 9
	1    T T T T T T T T
	2 T    T F T F T F T
	3 T T    T T F T T F
	4 T F T    T F T F T
	5 T T T T    T T T T
	6 T F F F T    T F F
	7 T T T T T T    T T
	8 T F T F T F T    T
	9 T T F T T F T T
*/

public class RelativelyPrimeArray{ // start of class
  public static void main(String[] args){ // start of main
    //variables
    int n = Integer.parseInt(args[0]); // int with input from user
    boolean[][] rpa = new boolean[n+1][n+1]; // boolean array
    char[][] charArray = new char[n+1][n+1]; // char array

    String format = "%C "; // formats the output of the charArray

    // lables the columns
    System.out.print("  "); // adds padding to be columns
    for(int k = 1; k < rpa.length; k++){ // start of loop to lable columns
        System.out.print(k + " "); // prints the lables for the columns
      } // end of k loop
    System.out.println(); // prints a new line before the loops

    for(int i = 1; i < rpa.length; i++){ // start of i for loop
      System.out.print(i+" "); //numbers the rows
      for(int j = 1; j < rpa[i].length; j++){ // start of j for loop
          rpa[i][j] = false; // initialize boolean array

          // math to determine if prime
          if(i % j == 0 || j % i == 0){
            rpa[i][j] = false;
          } else rpa[i][j] = true;

            // statments to make single factors true
          if(i / j == i){
            rpa[i][j] = true;
          }
          if(j/i == j){
            rpa[i][j] = true;
          }



          // format of array printed to terminal
          if(rpa[i][j] == true){ // array comparison
            charArray[i][j] = 't'; // put a 't' in charArray if true
          }else charArray[i][j] = 'f'; // put 'f' in charArray if fal
          if(i == j){ // compares the i and j loops
            charArray[i][j] = ' '; // places a space if i and j are equal
          }
        System.out.printf(format,charArray[i][j]); // prints charArray
      } // end of j for loop
      System.out.println(); // prints new line after the need each j loop
    } // end of i for loop
    System.out.print((float)8/6);
  } // end of main
} // end of class

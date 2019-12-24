// Charles Panter
// COS-111 Intro to Programming (COS-111-OL009)
// Distribution100
/*
2. Write a well-documented (commented) program, “Distribution100,” that takes
integer command-line arguments. The first argument would be the count of the
remaining arguments that are between 1 and 100 (inclusive of 1 and 100).
It then prints out the count of numbers entered that are less than or equal
to 50 and the count of numbers that are greater than 50 from those remaining
arguments.  [MO2.1, MO2.2]

A sample run would be as follows.

> java Distribution100 15 5 82 2 1 74 19 47 64 39 77 25 99 100 1 10
9 numbers entered are less than or equal to 50.
6 numbers entered are greater than 50.

*/
public class Distribution100{ // Start of
  public static void main(String[] args) throws Exception{
    // variables 
    int n = Integer.parseInt(args[0]);
    int[] nums = new int[n];
    int j = 0;
    int k = 0;

      // input from user put into an array
      for(int i = 0; i < nums.length; i++){
        nums[i] = Integer.parseInt(args[i+1]);
        if(nums[i] <= 50){ // compairs if number is less than or equal to 50
          j++; // if less than or equal to 50 add 1 to j
        } else k++; // else add 1 to k
      }
      System.out.println(j + " numbers entered are less than or equal to 50.");
      System.out.println(k + " numbers entered are greater than 50.");
    System.out.println();

  }//End of Main
} // End of Class

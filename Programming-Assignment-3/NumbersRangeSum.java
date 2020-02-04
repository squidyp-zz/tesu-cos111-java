// SquidyP
// COS-111 Intro to Programming (COS-111-OL009)
// NumbersRangeSum
/*
2. Write a well-documented (commented) program, “NumbersRangeSum,” that
computes the sum of natural numbers in a given range entered by the user.
[MO3.1, MO3.2, MO3.3]
Notes:
Assume that the given range would include the starting and ending numbers
(i.e., it would be a closed range on both ends). Natural numbers are defined
as 1, 2, 3, 4, and so forth
The sum is returned by the method.
The program should have a static recursive method, “getSum” that takes two
natural numbers as arguments and computes the sum recursively. The sum is
returned by the method. This static method would be called by the main method.
Sample runs would be as follows.
>java NumbersRangeSum 6 10
The sum of natural numbers in range [6,10] is 40.
>java NumbersRangeSum 13 20
The sum of natural numbers in range [13, 20] is 132.
*/

public class NumbersRangeSum{ // start of class
  public static int getSum(int a, int b, int i, int sum){ //start of method
    if(i==b) return sum+b; // break condition
    sum+=a; a++; i++; // math
    return getSum(a,b,i,sum); // returning variables to the function
  } // end of method
  public static void main(String[] agrs){ // start of main
    int startInt = Integer.parseInt(agrs[0]);// stores the first int from user
    int endInt = Integer.parseInt(agrs[1]); // stores next int from user
    int counter = startInt; // counter initization
    int sum = 0; // sum initization
    System.out.println("The sum of natural number in the range ["+startInt+", "
    +endInt+"] is "+getSum(startInt,endInt,counter,sum)+"."); // output to console
  }// end of main
} // end of class

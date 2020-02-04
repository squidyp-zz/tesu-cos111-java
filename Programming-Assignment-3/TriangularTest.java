// SquidyP
// COS-111 Intro to Programming (COS-111-OL009)
// TriangularTest
/*
1. Write a well-documented (commented) program, “TriangularTest,” that tests
if the three integer values, entered by the user as command line arguments,
could be the sides of a triangle. If none of the input values is greater than
or equal to the sum of the other two, then the program should output “True”;
otherwise it should output “False.” [MO3.1, MO3.2]
The program should have a static method, “IsTriangular,” that performs the test.
This static method would be called by the main method.
Sample runs would be as follows.
>java TriangularTest 5 3 6
True
>java TriangularTest 5 12 6
False
*/

public class TriangularTest{ // start of class
  public static void IsTriangular(int a,int b,int c){// start of method
    if(a+b<=c || b+c<=a || c+a<=b){ // comparisons between variables
      System.out.println("False"); // prints the word False to the console
    }else System.out.println("True"); // prints the word True to the console
  }// end of method
  public static void main(String[] agrs){// start of main
    int a = Integer.parseInt(agrs[0]); // input from console
    int b = Integer.parseInt(agrs[1]); // input from console
    int c = Integer.parseInt(agrs[2]); // input from console
    IsTriangular(a,b,c); // using method, passing in variables
  }// end of main
}// end of class

// SquidyP
// COS-111 Intro to Programming (COS-111-OL009)
// AndOp

/*
2. Write a well-documented (commented) program, “AndOp,” that prints “true” if
two double values given as command line arguments are both strictly
between 0 and 1; otherwise, it prints “false.” [MO1.1, MO1.2]

Sample runs would be as follows.

>java AndOp 0.5 0.2
true

>java AndOp 0.4 1.0
false

>java AndOp 0.7 0.0
false

>java AndOp 0.3 0.9
true
*/
public class AndOp{
  public static void main (String [] args){
    //variables
    double num1 = Double.parseDouble(args[0]); //stores first user input into variable
    double num2 = Double.parseDouble(args[1]); //stores second user input into variable
    boolean numResult1; // boolean to store results
    boolean numResult2; //boolean to store results

    // if statements to process user information
    if(num1 > 0.0 && num1 < 1){ // makes a comparison if num1 is between 0.0 and 1
      numResult1 = true; // if num1 is between 0.0 and 1 stores value of true in boolean
    }else numResult1 = false; // if not value of false is stored in boolean
    if(num2 > 0.0 && num2 < 1){ // makes a comparison if num2 is between 0.0 and 1
      numResult2 = true; // if num2 is between 0.0 and 1 stores value of true
    }else numResult2 = false; // if not value of false is stored in boolean
    // if statement to compare the two boolean
    if(numResult1 == true && numResult2 == true){ // comparison between booleans
      System.out.println("true"); // if both are true print "true" to console
    }else System.out.println("false"); // if either are false print "false" to console
  }
}

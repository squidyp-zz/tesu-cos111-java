// SquidyP
// COS-111 Intro to Programming (COS-111-OL009)
//ISBN
/* 1.Write a well-documented (commented) program, “ISBN,” that takes a 9-digit
integer as a command-line argument, computes the checksum, and prints the ISBN
number. [MO4.1]
Note: You should use Java’s String data type to implement it. The International
Standard Book Number (ISBN) is a 10-digit code that uniquely specifies a book.
The rightmost digit is a checksum digit that can be uniquely determined from the
other 9 digits, from the condition that d1 + 2d2 +3d3 + ... + 10d10 must be a
multiple of 11 (here di denotes the ith digit from the right).
The checksum digit d1 can be any value from 0 to 10. The ISBN convention is to
use the character X to denote 10. The checksum digit corresponding to 032149805
is 4 since 4 is the only value of x between 0 and 10 (both inclusive), for which
10·0 + 9·3 + 8·2 + 7·1 + 6·4 + 5·9 + 4·8 +3·0 + 2·5 + 1·x is a multiple of 11.
Sample runs would be as follows.
>java ISBN 013376940
The ISBN number would be 0133769402
>java ISBN 013380780
The ISBN number would be 0133807800
*/
import java.util.Scanner;
public class ISBN{ //start of class
  public static void checksum(String a){ //start of method
    String[] stISBN = a.split(""); //convert string to string array
    int[] intISBN = new int[stISBN.length];
    double sum = 0; // variable to store ISBN sum
    int x = 0; // variable to store ISBN checksum value
    //loop to convert string to int array
    for(int i=0; i<stISBN.length; i++){ //start of loop
      intISBN[i]= Integer.parseInt(stISBN[i]);//covert string array to int array
    } //end of loop
    sum = (intISBN[0]*10)+(intISBN[1]*9)+(intISBN[2]*8)+(intISBN[3]*7)+
    (intISBN[4]*6)+(intISBN[5]*5)+(intISBN[6]*4)+(intISBN[7]*3)+(intISBN[8]*2);
    while(sum%11!=0){
      sum+=1;
      x++;
    }
    System.out.println("The ISBN number would be " + a+x);
  } // end of method
  public static void main(String[] args){ // start of main
    String inputISBN = args[0]; // input from CLI as argument
    checksum(inputISBN); // pass variable to method
  } // end of main
} //end of class

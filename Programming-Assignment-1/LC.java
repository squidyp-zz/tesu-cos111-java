// Charles Panter
// COS-111 Intro to Programming (COS-111-OL009)
// LC

/*
3: Write a well-documented (commented) program, “LC,” that, using one “for loop”
and one “if statement,” prints the integers from 1 to 100 with ten
integers per line. [MO1.1, MO1.2, MO1.3]
*/
public class LC{
  public static void main(String[] args){
    for(int i = 1; i < 101; i++){ // for loop that starts at 1 and end at 100
      System.out.print(i + " "); // prints the number and a space
      if(i % 10 == 0){ // if the counter divided by 10 has no remainder
        System.out.println(); // make a new line
      }
    }
  }
}

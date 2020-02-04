// SquidyP
// COS-111 Intro to Programming (COS-111-OL009)
//Point
/*
2. A class that implements a data type, “Point,” which has the following
constructor: [MO4.2, MO4.3]
a)Point(double x, double y, double z)
b)and, the following API:
  1) double distanceto(Point q)
    A. it returns the Euclidean distance between this and q.
      i. The Euclidean distance between (x1, y1, z1) and (x2, y2, z2) is defined
      as sqrt( (x1-x2)^2 + (y1-y2)^2) + (z1-z2)^2).
  2) String toString() – it returns the string representation of the point. An
    example would be (2.3,4.5,3.0).
  3) Write a main method in the class that is used to test it.
    A. It should create two Point objects using input provided by the user on the
      command-line.
    B. Then it should print out the two points followed by their Euclidean
      distance
A sample run would be as follows.
>java Point 2.1 3.0 3.5 4 5.2 3.5
The first point is (2.1,3.0,3.5)
The second point is (4.0,5.2,3.5)
Their Euclidean distance is 2.90
*/
public class Point{ //start of class
  double x,y,z = 0; // double variables
  public Point(double x, double y, double z){ // Point constructor
    this.x=x;
    this.y=y;
    this.z=z;
  } // end of constructor
  public double distanceto(Point q){ // API for Point of double type
    //Math
    double a = Math.pow(this.x - q.x, 2);
    double b = Math.pow(this.y - q.y, 2);
    double c = Math.pow(this.z - q.z, 2);
    double results = Math.sqrt(a+b+c);
     return results; // returns the Euclidean calculation
   }
   public String toString(){ // API for Point of String type
     // Coverts doubles to Strings
     String stX = String.valueOf(x);
     String stY = String.valueOf(y);
     String stZ = String.valueOf(z);
     String stOut = "("+stX+","+stY+","+stZ+")";
     return stOut; // returns a String
   }

  public static void main(String[] args){ // start of main test
    // Console arguments input for first set of points
    double fpt1 = Double.parseDouble(args[0]);
    double fpt2 = Double.parseDouble(args[1]);
    double fpt3 = Double.parseDouble(args[2]);
    // Console arguments input for second set of points
    double spt1 = Double.parseDouble(args[3]);
    double spt2 = Double.parseDouble(args[4]);
    double spt3 = Double.parseDouble(args[5]);

    // object using the user defined type Point
    Point ept1 = new Point(fpt1,fpt2,fpt3);
    Point ept2 = new Point(spt1,spt2,spt3);
    //Console eptOutput
    System.out.println("The first point is "+ept1.toString());
    System.out.println("The second point is "+ept2.toString());
    //formats output to two decimal points
    double eptOutput = Math.round(ept1.distanceto(ept2) * 100.0) / 100.0;
    System.out.println("Their Euclidean distance is "+eptOutput);
  }//end of main test
}//end of class

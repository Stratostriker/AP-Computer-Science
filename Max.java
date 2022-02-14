import java.util.Scanner;

public class Max {
  //Returns the largest of its four arguments.
  public static int max(int a, int b, int c, int d) {
    //To be implemented by student
    //returns the max of c and d, then returns the max of that number and b, then returns the max of that number and a
    int maximum = Math.max(a, Math.max(b, Math.max(c, d)));
    return maximum;
  }
  
  public static int min(int a, int b, int c, int d) {
    //To be implemented by student
    //returns the min of c and d, then returns the min of that number and b, then returns the min of that number and a
    int minimum = Math. min(a, Math.min(b, Math.min(c, d)));
    return minimum;
  }
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter 4 integers, separated by spaces: ");
    int n1 = input.nextInt();
    int n2 = input.nextInt();
    int n3 = input.nextInt();
    int n4 = input.nextInt();
    System.out.println("Largest is " + max(n1, n2, n3, n4));
    System.out.println("Smallest is " + min(n1, n2, n3, n4));
  }
}

//test inputs:
//1 2 3 4
//2 3 4 1
//2 2 3 1
//8 3 2 8
//16 16 16 16
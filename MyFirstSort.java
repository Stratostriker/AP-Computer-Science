import java.io.*;
import java.util.*;

public class MyFirstSort {
   public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      String str[] = new String[3];
      System.out.println("Enter a word: ");
      str[0] = sc.nextLine();
      System.out.println("Enter another word: ");
      str[1] = sc.nextLine();
      System.out.println("Enter one more word: ");
      str[2] = sc.nextLine();
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < i + 1; j++) {
            if (str[i].compareTo(str[j]) > 0) {   
               String temp = str[i];
               str[i] = str[j];
               str[j] = temp;
            }
         }
      }
      System.out.println("In order: " + str[2] + " " + str[1] + " " + str[0]);
   }
}
/* 
 * https://www.tutorialspoint.com/java/java_string_valueof.htm
 * 
 * Learned something from the link above 
 * but the concept is not fully cleared to me.
 * I need further instruction.
 * 
 * ~Kingshuk
 *
 */

import java.util.*;


public class cse111Lab3Task7p
{
  public static void main(String[] args)
  {
    double d = 102939939.939;
    double f= 5.5f;
    int i=7;
      boolean b = true;
      long l = 1232874;
      char ch = 'K';
      char[] arr = {'a', 'b', 'c', 'd', 'e', 'f','g' };

      System.out.println("Return Value : " + String.valueOf(d) );
      System.out.println("Return Value : " + String.valueOf(b) );
      System.out.println("Return Value : " + String.valueOf(l) );
      System.out.println("Return Value : " + String.valueOf(arr) );
      
      System.out.println("Return Value : " + String.valueOf(ch) );
      System.out.println("Return Value : " + String.valueOf(f) );
      System.out.println("Return Value : " + String.valueOf(i) );
  }
  
}
import java.util.*;


public class cse111Lab3Task2
{
  public static void main(String[] args)
  {
    Scanner keyIn = new Scanner(System.in);
    
    String string = keyIn.nextLine();
    
    for(int i=0; i<string.length(); i++)
    {
      System.out.println(string.charAt(i));
    }
    
  }
  
}
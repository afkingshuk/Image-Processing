import java.util.*;


public class cse111Lab3Task3
{
  public static void main(String[] args)
  {
    Scanner keyIn = new Scanner(System.in);
    
    String string = keyIn.nextLine();
    char ch;
    for(int i=0; i<string.length(); i++)
    {
      ch= string.charAt(i);
      System.out.println(ch + " : " + (int) ch);
    }
    
  }
  
}
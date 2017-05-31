import java.util.*;


public class cse111Lab3Task7c
{
  public static void main(String[] args)
  {
    Scanner keyIn = new Scanner(System.in);
    
    String passwordInput = keyIn.nextLine();
    //String password = "bangladesh is love";
    
    boolean result = passwordInput.startsWith("bangladesh") ;
    
    if(result == true)
    {
      System.out.println("prothom milse");
    }
    
    else
    {
      System.out.println("prothom mile nai");
    }
    
  }
  
}
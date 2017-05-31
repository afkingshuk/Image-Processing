import java.util.*;


public class cse111Lab3Task7d
{
  public static void main(String[] args)
  {
    Scanner keyIn = new Scanner(System.in);
    
    String passwordInput = keyIn.nextLine();
    //String password = "bangladesh is love";
    
    boolean result = passwordInput.endsWith("bangladesh") ;
    
    if(result == true)
    {
      System.out.println("shesh milse");
    }
    
    else
    {
      System.out.println("shesh mile nai");
    }
    
  }
  
}
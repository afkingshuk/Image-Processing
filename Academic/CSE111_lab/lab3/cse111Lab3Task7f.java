import java.util.*;


public class cse111Lab3Task7f
{
  public static void main(String[] args)
  {
    Scanner keyIn = new Scanner(System.in);
    
    String passwordInput = keyIn.nextLine();
    String password = "bangladesh is my love";
    
    boolean result = passwordInput.equalsIgnoreCase(password) ;
    
    if(result == true)
    {
      System.out.println("Yo milse ... without case sensitivity");
    }
    
    else
    {
      System.out.println("mile nai ... ");
    }
    
  }
  
}
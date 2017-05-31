import java.util.*;


public class cse111Lab3Task7e
{
  public static void main(String[] args)
  {
    Scanner keyIn = new Scanner(System.in);
    
    String passwordInput = keyIn.nextLine();
    String password = "bangladesh is my love";
    
    boolean result = passwordInput.equals(password) ;
    
    if(result == true)
    {
      System.out.println("Yo milse");
    }
    
    else
    {
      System.out.println("mile nai ... case sensitive kintu");
    }
    
  }
  
}
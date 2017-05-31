import java.util.*;


public class cse111Lab3Task7b
{
  public static void main(String[] args)
  {
    Scanner keyIn = new Scanner(System.in);
    
    String passwordInput = keyIn.nextLine();
    String password = "bangladesh";
    
    int result = password.compareToIgnoreCase(passwordInput) ;
    
    if(result == 0)
    {
      System.out.println("Passwrod Matched!!");
    }
    else if(result >=0)
    {
      System.out.println("Sorry Password doesnt match and smaller than password");
    }
    else
    {
      System.out.println("Sorry Password doesnt match and Bigger than password");
    }
    
  }
  
}
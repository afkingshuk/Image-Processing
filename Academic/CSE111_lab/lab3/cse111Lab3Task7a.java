import java.util.*;


public class cse111Lab3Task7a
{
  public static void main(String[] args)
  {
    Scanner keyIn = new Scanner(System.in);
    
    String passwordInput = keyIn.nextLine();
    String password = "bangladesh";
    
    if(password.compareTo(passwordInput) == 0)
    {
      System.out.println("Passwrod Matched!!");
    }
    else
    {
      System.out.println("Sorry Password doesnt match ");
    }
    
  }
  
}
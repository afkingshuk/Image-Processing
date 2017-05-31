import java.util.*;


public class cse111Lab3Task7g
{
  public static void main(String[] args)
  {
    Scanner keyIn = new Scanner(System.in);
    
    String input = keyIn.nextLine();
    //String password = "bangladesh is my love";
    //String string = "I love my country Bangladesh";
    
    int result = input.indexOf('z') ;
    
     
    if(result != -1)
    {
      System.out.println(result);
    }
    
    else
    {
      System.out.println("Tomar input er kothao 'z' nai");
    }
    
  }
  
}
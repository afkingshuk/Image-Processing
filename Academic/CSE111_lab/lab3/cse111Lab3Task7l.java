import java.util.*;


public class cse111Lab3Task7l
{
  public static void main(String[] args)
  {
    Scanner keyIn = new Scanner(System.in);
    
    String input = keyIn.nextLine();
    //String password = "bangladesh is my love";
    String kotha = "I love my country Bangladesh";
    
    char[] charArray = kotha.toCharArray();
    char[] inputCharArray = input.toCharArray();
    //char reverseCharArray = Collections.reverse(charArray);
    
    System.out.println("Length of kotha: "+charArray.length);
    //System.out.println("kotha: " + kotha);
    System.out.print("Kotha: ");
    for(char i: charArray)
    {
      System.out.print(i);
    }
    System.out.print("\n Reverse Kotha: ");
    for(int i=(charArray.length -1); i>=0 ; i--)
    {
      System.out.print(charArray[i]);
    }
    System.out.println();
    
    System.out.println("Length of input: "+inputCharArray.length);
    System.out.print("input: ");
    
    for(char i: inputCharArray)
    {
      System.out.print(i);
    }
    System.out.print("\n Reverse input: ");
    for(int i=(inputCharArray.length -1); i>=0 ; i--)
    {
      System.out.print(inputCharArray[i]);
    }
    System.out.println();
    
  }
  
}
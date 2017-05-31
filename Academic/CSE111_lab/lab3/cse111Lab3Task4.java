import java.util.*;


public class cse111Lab3Task4
{
  public static void main(String[] args)
  {
    Scanner keyIn = new Scanner(System.in);
    int[] array = new int[26];
    
    String string = keyIn.nextLine();
    char ch;
    
    for(int i=0; i<string.length(); i++)
    {
      ch= string.charAt(i);
      array[ch - 'A']=array[ch -'A']+1;
    }
    
    for(int i=0; i<26; i++)
    {
      System.out.println((char)(i+65) + " which is " + (i+65) + " was found " + array[i] + " times");
    }
  }
  
}
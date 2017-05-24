import java.util.*;

public class lab2_task4
{
  public static void main(String[] args)
  {
     Scanner scanf = new Scanner(System.in);
     int[] array = new int[20];
     int arraySize = array.length;
     for(int i=0; i<arraySize; i++)
     {
       array[i] = scanf.nextInt();
     }
     
     for(int i= arraySize-1; i>=0 ; i--)
     {
       if(array[i]%2 == 0)
       {
         System.out.println(array[i]);
       }
     }
  }
}
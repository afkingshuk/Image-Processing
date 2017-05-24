import java.util.*;

public class lab2_task6_b
{
  public static void main(String[] args)
  {
     Scanner scanf = new Scanner(System.in);
     int[] array = new int[15];
     int arraySize = array.length;
          
     for(int i=0; i<arraySize; i++)
     {
       int x= scanf.nextInt();
       array[x]++;
       
     }
     
     for(int i=0; i<arraySize; i++)
     {
     System.out.printf("%d is %d \n",i, array[i]);        
     }
  }
}
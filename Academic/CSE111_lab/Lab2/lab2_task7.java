import java.util.*;

public class lab2_task7
{
  public static void main(String[] args)
  {
     Scanner scanf = new Scanner(System.in);
     int[] array = new int[5];
     int arraySize = array.length;
     int i=0,j=0;     
     for(i=0; i<arraySize; i++)
     {
       array[i] = scanf.nextInt();
       for(j=0; j<=i; j++)
       {
         System.out.println(array[j]);
       }
     }
  }
}
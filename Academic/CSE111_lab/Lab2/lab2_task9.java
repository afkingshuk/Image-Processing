import java.util.*;

public class lab2_task9
{
  public static void main(String[] args)
  {
     Scanner scanf = new Scanner(System.in);
     int[] array = new int[10];
     int arraySize = array.length;
     int i=0,j=0;
     for(i=0; i<arraySize; i++)
     {
       array[i] = scanf.nextInt();       
     }
     
     for(j=0; j<arraySize ; j+=2)
     {
       System.out.println(array[j]);
     }
     for(j=1; j<arraySize ; j+=2)
     {
       System.out.println(array[j]);
     }
  }
}
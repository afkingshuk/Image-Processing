import java.util.*;

public class lab2_task5
{
  public static void main(String[] args)
  {
     Scanner scanf = new Scanner(System.in);
     int[] array = new int[10];
     int arraySize = array.length;
     int flag=0;
     for(int i=0; i<arraySize; i++)
     {
       array[i] = scanf.nextInt();
     }
     
     int input = scanf.nextInt();
     
     for(int i= arraySize-1; i>=0 ; i--)
     {
       if(input == array[i])
       {
         flag++;
         break;
       }      
     }
     
     if(flag !=0)
     {
       System.out.println("yes");
     }
     else
     {
       System.out.println("no");
     }
  }
}
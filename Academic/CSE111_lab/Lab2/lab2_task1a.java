public class lab2_task1a
{
  public static void main(String[] args)
  {
    double z = 5+ Math.sin(80*Math.PI/180);
    
    System.out.println(z);
    System.out.printf("%f \n", z);
    System.out.printf("%5.10f \n", z);
    System.out.printf("%.64f \n", z);
    
    System.out.printf("%,.2f\n", z);
System.out.printf("%-10.2f: \n ", z);
//System.out.printf("%4d", z);
System.out.printf("%20.10f\n", z); 
  }
}
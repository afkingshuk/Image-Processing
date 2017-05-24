import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        //System.out.print("Enter a positive number: ");
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();
        int count=0, i=0;
        for (i = 2; i<=(number); i++) {
            count = 0;
            while (number % i == 0) {
                number /= i;
                count++;
                if (count == 0) {
                    continue;
                }
            }
            //System.out.println(i+ "**" + count);
        }
        System.out.println(i+ "**" + count);
    }
}
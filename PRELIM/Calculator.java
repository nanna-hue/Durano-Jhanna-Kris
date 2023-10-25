import java.util.Scanner;

public class Calculator
{
   public static void main (String [] args)
   {
   
   Scanner sc = new Scanner(System.in);
   
   System.out.print("Input num 1: ");
   int num1 = sc.nextInt();
   System.out.print("Input num 2: ");
   int num2 = sc.nextInt();
   
   int multi = num1 * num2;
   int div = num1/num2;
   int add = num1 + num2;
   
   System.out.println("Product: " + multi + "\nQoutient: " + div + "\nTotal: " + add);

   }
}

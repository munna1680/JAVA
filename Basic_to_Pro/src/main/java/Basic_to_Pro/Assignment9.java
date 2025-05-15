package Basic_to_Pro;
import java.util.Scanner;

public class Assignment9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int fact = 1;
        for(int i = 1; i <= num1; i++)
        {
            fact = fact * i;
        }
        System.out.print("Factorial of " + num1 + " is " + fact);
    }
}

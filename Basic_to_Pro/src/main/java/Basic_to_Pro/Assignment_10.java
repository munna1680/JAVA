package Basic_to_Pro;

import java.util.Scanner;

public class Assignment_10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = 0;
        for(int i = num1; i <= num2; i++)
        {
            if(i % 2 != 0)
            {
                sum += i;
            }
        }
        System.out.println("Sum of odd numbers between " + num1 + " and " + num2 + " is " + sum);

    }
}

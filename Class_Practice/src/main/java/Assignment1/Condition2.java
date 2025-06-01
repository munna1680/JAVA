package Assignment1;

import java.util.Scanner;

public class Condition2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num;
        int evenSum = 0;
        int oddSum = 0;

        System.out.print("Enter numbers: ");
        for(int i = 0; i < 5; i++)
        {
            num = sc.nextInt();

            if(num % 2 == 0)
            {
                evenSum += num;
            }
            else
            {
                oddSum += num;
            }
        }
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        System.out.println();

        if(evenSum > oddSum)
        {
            System.out.println("Even sum is greater.");
        }
        else if(oddSum > evenSum)
        {
            System.out.println("Odd sum is greater.");
        }
        else
        {
            System.out.println("Both sums are equal.");
        }
        sc.close();
    }
}

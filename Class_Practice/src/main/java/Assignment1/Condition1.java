package Assignment1;

import java.util.Scanner;

public class Condition1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Score: ");
        int score = sc.nextInt();
        System.out.print("Enter Temperature: ");
        int temperature = sc.nextInt();

        if(score >= 10 && temperature >= 100)
        {
            System.out.println("It's hot out!");
        }

        else if(score < 5 || temperature <= 32)
        {
            System.out.println("I'm in a bad mood.");
        }

        else if(score >= 5)
        {
            System.out.println("Score is 5 or more.");
        }
        sc.close();
    }
}

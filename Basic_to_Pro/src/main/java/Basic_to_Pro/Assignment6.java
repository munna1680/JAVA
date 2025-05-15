package Basic_to_Pro;
import java.util.Scanner;

public class Assignment6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Have you completed your Master's? (y/n)");
        char q1 = sc.next().charAt(0);

        System.out.println("Are you fluent in English? (y/n)");
        char q2 = sc.next().charAt(0);

        if(q1 == 'y' && q2 == 'y')
        {
            System.out.println("You are eligible for the job interview.");
        }
        else
        {
            System.out.println("You are not eligible for the job interview.");
        }
    }
}

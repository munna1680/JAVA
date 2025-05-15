package Basic_to_Pro;
import java.util.Scanner;

public class Assignment3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if(age >= 18)
        {
            System.out.println("Valid voter");
        }
        else
        {
            System.out.println("Invalid voter");
        }
        sc.close();
    }

}

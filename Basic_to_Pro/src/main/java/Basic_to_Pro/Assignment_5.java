package Basic_to_Pro;
import java.util.Scanner;

public class Assignment_5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you love Java?");

        char ch = sc.next().charAt(0);
        if(ch == 'y' || ch == 'Y')
        {
            System.out.println("You are a Java lover.");
        }
        else if(ch == 'n' || ch == 'N')
        {
            System.out.println("You are not a Java lover.");
        }
    }
}

package Basic_to_Pro;

import java.util.Scanner;

public class Assignment7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an option = ");

        int option = sc.nextInt();
        switch(option)
        {
            case 1:
                System.out.println("Set language Bengali");
                break;
            case 2:
                System.out.println("Set language Hindi");
                break;
            case 3:
                System.out.println("Set language Urdu");
                break;
            default:
                System.out.println("Set language English");
        }

    }
}

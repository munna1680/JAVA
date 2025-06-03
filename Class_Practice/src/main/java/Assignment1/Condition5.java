package Assignment1;

import java.util.Scanner;

public class Condition5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        int primarySum = 0;
        int secondarySum = 0;

        for(int i = 0; i < n; i++)
        {
            primarySum += arr[i][i];
            secondarySum += arr[i][n - 1 - i];
        }

        int diff = Math.abs(primarySum - secondarySum);

        System.out.println(diff);
    }

}

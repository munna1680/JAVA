package Assignment1;

import java.util.Scanner;

public class Condition6
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        int maxLen = 1;
        int currLen = 1;

        for(int i = 1; i < n; i++) 
        {
            if(arr[i] > arr[i - 1]) 
            {
                currLen++;

                if(currLen > maxLen) 
                {
                    maxLen = currLen;
                }
            } 
            else 
            {
                currLen = 1;
            }
        }

        System.out.println(maxLen);

        sc.close();
    }
}

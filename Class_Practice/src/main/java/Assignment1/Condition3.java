package Assignment1;

import java.util.Scanner;

public class Condition3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        double[] averages = new double[n];

        double maxAvg = 0;
        String topStudent = "";

        for (int i = 0; i < n; i++)
        {
            names[i] = sc.nextLine();

            int testCount = sc.nextInt();
            int sum = 0;

            for (int j = 0; j < testCount; j++)
            {
                sum += sc.nextInt();
            }

            double avg = (double) sum / testCount;

            averages[i] = avg;

            if (avg > maxAvg)
            {
                maxAvg = avg;
                topStudent = names[i];
            }
            sc.nextLine();
        }

        for (int i = 0; i < n - 1; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (averages[j] > averages[i])
                {
                    double tempAvg = averages[i];
                    averages[i] = averages[j];
                    averages[j] = tempAvg;

                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }

        System.out.println("Top Student: " + topStudent);
        System.out.println("Sorted List:");

        for (int i = 0; i < n; i++)
        {
            System.out.printf("%s - %.1f\n", names[i], averages[i]);
        }

        sc.close();
    }
}

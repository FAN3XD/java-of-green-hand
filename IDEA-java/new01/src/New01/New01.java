package New01;

import java.util.Scanner;

public class New01 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("enter x:");
      int x = in.nextInt();
      int[] numbers = new int[x];
      double sum = 0;
      int i;
      for (i=0;i<numbers.length;i++)
      {
          System.out.print("enter number[" + i + "]" + ":");
          numbers[i] = in.nextInt();
          sum += numbers[i];
      }
        double Average = sum/x;

      for(i=0;i<numbers.length;i++)
      {
          if(i==0)
          {
              System.out.print("The sum of " + numbers[i] + " and ");
          }
          else if(i==(x-1))
          {
              System.out.println(numbers[i] + " is " + sum + " .");
          }
          else
          {
              System.out.print(numbers[i] + " and ");
          }
      }

        for(i=0;i<numbers.length;i++)
        {
            if(i==0)
            {
                System.out.print("The Average of " + numbers[i] + " and ");
            }
            else if(i==(x-1))
            {
                System.out.println(numbers[i] + " is " + Average + " .");
            }
            else
            {
                System.out.print(numbers[i] + " and ");
            }
        }
    }
}


package Triangle02;

import java.util.Scanner;

public class Triangle02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter x: ");
        int x= in.nextInt();

        for (int i=1;i<=x;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

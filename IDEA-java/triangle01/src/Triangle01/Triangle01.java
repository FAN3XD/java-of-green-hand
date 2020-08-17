package Triangle01;

import java.util.Scanner;

public class Triangle01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter x: ");
        int x = in.nextInt();

        for(int i=1;i<=x;i++)
        {
            for (int j=(x-i);j>0;j--)
            {
                System.out.print(" ");
            }
            for(int y=((i*2)-1);y>0;y--)
            {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}

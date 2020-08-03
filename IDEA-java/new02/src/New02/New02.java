package New02;

import java.util.Scanner;

public class New02 {
    public static int sum(int x,int y)
    {
        if(x>y)
        {
            x=x+y;
            y=x-y;
            x=x-y;
        }

        int sum=0;
        for (int i=x;i<=y;i++)
        {
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter x:");
        int x = in.nextInt();
        System.out.print("enter y:");
        int y = in.nextInt();
        System.out.println(sum(x,y));


    }
}

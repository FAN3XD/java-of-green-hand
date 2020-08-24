package Pat1006;
/*
让我们用字母 B 来表示“百”、字母 S 表示“十”，
用 12...n 来表示不为零的个位数字 n（<10），
换个格式来输出任一个不超过 3 位的正整数。
例如 234 应该被输出为 BBSSS1234，
因为它有 2 个“百”、3 个“十”、以及个位的 4。

输入格式：
每个测试输入包含 1 个测试用例，给出正整数 n（<1000）。

输出格式：
每个测试用例的输出占一行，用规定的格式输出 n。

输入样例 1：
234
输出样例 1：
BBSSS1234
输入样例 2：
23
输出样例 2：
SS123
 */

import java.util.Scanner;

public class Pat1006 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 10000;
        while (n<0||n>1000)
        {
            System.out.print("enter n :");
            n = in.nextInt();

            if(n<0||n>1000)
            {
                System.out.println("need 0<n<1000.");
            }
        }

        System.out.println("n= " + n + " .");
        int hundred=0;
        if(n>99)
        {
            hundred=n/100;
            for (int i = 0; i<hundred;i++)
            {
                System.out.print("B");
            }
        }
        int ten=0;
        if (n>9)
        {
            ten = (n-(hundred*100))/10;
            for (int i =0; i<ten; i++)
            {
                System.out.print("S");
            }
        }
        int digits = n-(hundred*100)-(ten*10);
        if(digits==0)
        {
            System.out.print(0);
        }
        else
        {

            for (int i = 1; i <= digits; i++)
            {
                System.out.print(i);
            }
        }


    }
}

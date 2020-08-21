package Pat02;
/*
读入一个正整数 n，计算其各位数字之和，用汉语拼音写出和的每一位数字。

输入格式：
每个测试输入包含 1 个测试用例，即给出自然数 n 的值。这里保证 n 小于 10
​100
​​ 。

输出格式：
在一行内输出 n 的各位数字之和的每一位，拼音数字间有 1 空格，但一行中最后一个拼音数字后没有空格。

输入样例：
1234567890987654321123456789
输出样例：
yi san wu
 */

import java.util.Scanner;

public class Pat02 {
    /*
    未完成
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter n: ");
        double n = in.nextDouble();

        int z=0;
        double x;
        int y=1;
        int number=0;
        x = n;
        while (x!=0)
        {
            z=0;
            y=1;
            while (y!=0)
            {
                x = x+1;
                y = (int) (x%10);
                z++;
                //System.out.println("x=" + x + ". y= " + y + ".");
            }
            //System.out.println(10-z);
            number = number +(10-z);
            x= (x-z-(10-z))/10;
            //System.out.println(x);
            //System.out.println(number);

        }
        System.out.println(number);



    }
}

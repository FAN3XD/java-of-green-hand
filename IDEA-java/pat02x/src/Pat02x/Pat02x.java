package Pat02x;

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

public class Pat02x {
    /*
    未完成
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("enter n: ");
        double n = in.nextDouble();
        int y=0,i=0,z=0;
        double x=0.00;
        int number=0;
        String [] a = new String[]{"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};

        while (n!=0)
        {
               x = (x+ n%10);
               n= (n-(n%10))/10;
        }
        //System.out.println(x);
        y= (int) x;
        i=0;
        while (y!=0)
        {
            i=i+1;
            y=(y-(y%10))/10;
        }

        //System.out.println(i);
        int j=i;
        y= (int) x;
       int[] b = new int[i];
       while (i>0)
       {
           b[i-1]=y%10;
           y=(y-(y%10))/10;
           i--;
       }
       while (j>1)
       {
           System.out.print(a[b[z]] + " ");
           z++;
           j--;
       }
       System.out.print(a[b[z]]);

        


    }
}


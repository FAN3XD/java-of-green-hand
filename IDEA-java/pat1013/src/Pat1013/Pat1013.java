package Pat1013;

import java.util.Scanner;

public class Pat1013 {
    /*
    令 P
​i
​​  表示第 i 个素数。现任给两个正整数 M≤N≤10
​4
​​ ，请输出 P
​M
​​  到 P
​N
​​  的所有素数。

输入格式：
输入在一行中给出 M 和 N，其间以空格分隔。

输出格式：
输出从 P
​M
​​  到 P
​N
​​  的所有素数，每 10 个数字占 1 行，其间以空格分隔，但行末不得有多余空格。

输入样例：
5 27
输出样例：
11 13 17 19 23 29 31 37 41 43
47 53 59 61 67 71 73 79 83 89
97 101 103
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter M:");
        int M = in.nextInt();
        System.out.print("enter N:");
        int N = in.nextInt();

        int num = 0;
        int number = 3;


        int[] prime = new int[N+1];

        prime[0]=1;
        prime[1]=2;
        prime[2]=3;

        int i=5;
       while (true)
       {
           for (int j=2;j<(i/2+1);j++)
           {
               if(i%j==0)
               {
                   num=1;break;
               }
           }
           if (num==0)
           {
               prime[number++]=i;
           }
           else
           {
               num=0;
           }
           if(number<=N)
           {

           }
           else
           {
               break;
           }
           i+=2;
       }
       for (int x=M;x<prime.length;x++)
       {
           if((x-M)%10==0)
           {
               System.out.println();
           }
           System.out.print(prime[x] + " ");
       }
    }
}

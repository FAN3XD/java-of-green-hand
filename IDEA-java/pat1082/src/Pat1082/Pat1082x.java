package Pat1082;

import java.util.Scanner;

public class Pat1082x {
    /*
    本题目给出的射击比赛的规则非常简单，谁打的弹洞距离靶心最近，谁就是冠军；谁差得最远，谁就是菜鸟。
    本题给出一系列弹洞的平面坐标(x,y)，请你编写程序找出冠军和菜鸟。我们假设靶心在原点(0,0)。

输入格式：
输入在第一行中给出一个正整数 N（≤ 10 000）。随后 N 行，每行按下列格式给出：

ID x y
其中 ID 是运动员的编号（由 4 位数字组成）；
x 和 y 是其打出的弹洞的平面坐标(x,y)，均为整数，且 0 ≤ |x|, |y| ≤ 100。
题目保证每个运动员的编号不重复，且每人只打 1 枪。

输出格式：
输出冠军和菜鸟的编号，中间空 1 格。题目保证他们是唯一的。

输入样例：
3
0001 5 7
1020 -1 3
0233 0 -1
输出样例：
0233 0001
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter Quantity:");
        int quantity = in.nextInt();
        String[] athleteName = new String[quantity];
        int[] athleteX = new int[quantity];
        int[] athleteY = new int[quantity];
        double[] athleteArea = new double[quantity];
        double max=0;
        double min=9999999;
        int maxName=0;
        int minName=0;


        for(int i=0;i<quantity;i++)
        {

            athleteName[i] = in.next();
            athleteX[i] = Integer.valueOf(in.next());
            athleteY[i] = Integer.valueOf(in.next());
            athleteArea[i] = Math.sqrt(Math.abs(athleteX[i])*Math.abs(athleteX[i])+Math.abs(athleteY[i])*Math.abs(athleteY[i]));
            if(athleteArea[i]>max)
            {
                max = athleteArea[i];
                maxName = i;
            }
            if(athleteArea[i]<min)
            {
                min = athleteArea[i];
                minName = i;
            }
        }





        System.out.println( athleteName[minName] + " " + athleteName[maxName] );





 
    }
}


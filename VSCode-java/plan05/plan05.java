import java.util.Scanner;

public class plan05{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter x:");
        int x = in.nextInt();
        System.out.print("enter y:");
        int y = in.nextInt();
        int GCD = 0;     //最大公约数
        int LCM = 0;    //最小公倍数
        
        if(x<y)
        {
            x=x+y;
            y=x-y;
            x=x-y;
        }
        else
        {
            ;
        }
        
        int i;
        for(i=y;i>0;i--)
        {
            if(x%i==0&&y%i==0)
            {
                GCD = i;break;
            }
        }

        LCM = (x*y)/GCD;

        System.out.println("The GCD of " + x + " and " + y + " is " + GCD);
        System.out.println("The LCM of " + x + " and " + y + " is " + LCM);
    }
}
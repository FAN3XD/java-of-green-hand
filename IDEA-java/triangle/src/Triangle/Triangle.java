package Triangle;

public class Triangle {
    public static void main(String[] args) {
        for (int i=1; i<=9;i++)
        {
            for (int x=9-i;x>0;x--)
            {
                System.out.print(" ");
            }
            if(i==1)
            {
                System.out.print("*");
            }
            else
            {
                for(int y=(i*2)-1;y>0;y--)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

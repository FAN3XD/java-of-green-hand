import java.util.Scanner;

public class plan04{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter number :");
        int number = in.nextInt();
        int i;
        int judgment = 0;
        int count = 0;
        for(i=2;i<number;i++)
        {
            int j;
            for(j=2;j<((i/2)+1);j++)
            {
                
                //System.out.println(i + "%" + j +"=" +  (i%j));

                if(i%j == 0 )
                {
                    judgment = 1;
                    break;
                }
                
            }
            

            if(judgment == 0)
            {
                System.out.println(i + " is a PrimeNumber.");
                count++;
            }
            else
            {
                judgment = 0;
            }
        }

        System.out.println(count + " numbers between 1 and " + number + " are Prime numbers." );
        
    }
}
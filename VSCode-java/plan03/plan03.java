import java.util.Random;
import java.util.Scanner;

public class plan03{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = (int)(Math.random()*100);
        int count =0;
        int x=-1;
        while(x!=number)
        {
            count++;
            System.out.print("enter x:");
             x = in.nextInt();
             if(x!=number)
             {
                 System.out.println("you guessed wrong.");

                 if(x>number)
                 {
                     System.out.println("you guessed number so big.");
                 }
                 else
                 {
                     System.out.println("you guessed number so small.");
                 }
             }
             else
             {
                 System.out.println("you guessed win in "+ count + ".number=" + number + ".");
             }
            
        }

        
    }
}
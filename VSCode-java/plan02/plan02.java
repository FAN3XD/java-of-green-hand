import java.text.NumberFormat.Style;
import java.util.Scanner;


public class plan02{

     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int sum = 0; 
         int count = 1;
         int i=0;

         System.out.print("enter num:");
         int num =in.nextInt();
         while(i==0)
         {
             
             num = num/10;
             if(num!=0)
             {
                 count = count + 1;
             }
             if(num==0)
             {
                 i=1;
             }    
         }

         System.out.println("putnum=" + count);
         
    }
}

import java.util.Scanner;
public class Prime1
{
   public static void main(string args[])
     {
     Scanner sc = new scanner(system.in);
     int num1,num2;
     System.out.println("please enter the first numbers:");  
     num1=sc.nextInt();
     System.out.println("please enter the second numbers:");
     num2=sc.nextInt();
     System.out.println("Prime numbers:")l
        for(int i+num1;i<=num2;i++)
        {
          int j;
          for(j=2;j<i;j++)
          {
          int n=i%j;
          if(n==0)
            {
            break;
            }
          }
          if(i==j)
           {
           system.out.println(" "+i);
           }
         }
      }
} 
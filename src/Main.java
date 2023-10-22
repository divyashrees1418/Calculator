
import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
    
     Scanner sc=new Scanner(System.in);
     
     do
         
     {
        System.out.println("Enter your choice : ");
        System.out.println("1-Addition");
        System.out.println("2-Subtraction");
        System.out.println("3-Multiplication");
        System.out.println("4-Division");
        System.out.println("5-Exist ");
        int choice=sc.nextInt();
        
        if(choice >=5)
        {
            break;
        }
        
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        
         System.out.println("Enter the second number");
        int b=sc.nextInt();
        
         Operation opr=new Operation();
     
         int result=opr.Operation(choice,a,b);
         System.out.println("Result is:"+result);
     }
    
     while(true);
     sc.close();
     }
}

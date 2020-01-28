//Program to check whether the given number is positive or negative
package lab1pp;
import java.util.Scanner;


public class Lab1pp {

   
    public static void main(String[] args) {
       Scanner Sc =new Scanner(System.in);
       System.out.printf("enter the number = ");
       float number= Sc.nextFloat();
       if (number<0)
            System.out.println("The given number is negative number");
       else if(number==0)
            System.out.println("The given number is neither negative nor positive number");
       else
            System.out.println("The given number is positive number");
           
    }
    
}

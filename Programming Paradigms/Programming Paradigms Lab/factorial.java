//Program to find Factorial of given number
//Program done by Deepak R
package factorial;
import java.util.Scanner;
public class Factorial {   
    public static void main(String[] args) {
        int fact=1,i;
       Scanner Sc =new Scanner(System.in);
       System.out.printf("enter the number = ");
       int number= Sc.nextInt();
       if (number==0 | number==1){
           System.out.println("Factorial of the Given number is 1");}
       
       else {
           for(i=2;i<=number;i++)
           {fact=fact*i;
           }
            System.out.println("Factorial of the Given number is "+fact);}
    }
}

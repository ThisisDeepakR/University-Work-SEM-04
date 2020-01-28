
package div;
import java.util.Scanner;


public class Div {

    
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
         System.out.printf("enter the value of divisor=");
         int divisor= Sc.nextInt();
         System.out.printf("enter the value of divdend=");
         int dividend= Sc.nextInt();
         int remainder = dividend%divisor;
         int quotient = dividend/divisor;
         System.out.println("For given number the Remainder is "+remainder +" the quotient is " +quotient);
         
         
    }
    
}

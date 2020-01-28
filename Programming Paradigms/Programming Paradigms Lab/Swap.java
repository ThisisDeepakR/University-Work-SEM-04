
package swap;
import java.util.Scanner;


public class Swap {

    
    public static void main(String[] args) {
         Scanner Sc =new Scanner(System.in);
         System.out.printf("enter the value of a and b separated by space =");
         int a= Sc.nextInt();
         int b= Sc.nextInt();
         int temp = a;
         a=b;
         b=temp;
         System.out.println("swapped a= " +a );
         System.out.println("swapped b= " +b );
    }
    
}

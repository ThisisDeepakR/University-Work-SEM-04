
package evenodd;
import java.util.Scanner;


public class Evenodd {


    public static void main(String[] args) {
     Scanner Sc =new Scanner(System.in);
        System.out.printf("enter the number = ");
        int p= Sc.nextInt();
        int r = p%2;
        if (r==0)
             System.out.println("The given number is even");
        else
            System.out.println("The given number is odd");
       
    }
    
}

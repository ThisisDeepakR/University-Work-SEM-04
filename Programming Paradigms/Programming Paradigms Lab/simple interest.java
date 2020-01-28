
package tutorial.pkg1;
import java.util.Scanner;



public class Tutorial1 {

    
    public static void main(String[] args) {
        
        Scanner Sc =new Scanner(System.in);
        System.out.printf("principle Amount in Rupee=");
        int p= Sc.nextInt();
       
        System.out.printf("Time in years=");
        int t= Sc.nextInt();
       
        System.out.printf("rate in percentage=");
        int r= Sc.nextInt();
        
        int SI =p*t*r/100;
        System.out.println("The simple interest is "+SI);
        
        
        
        
        
        
        
    }
    
}

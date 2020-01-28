//Program to find whether given year is leap year or not
//Program done by Deepak R
package leapyear;

import java.util.Scanner;


public class Leapyear {
    

    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
       System.out.printf("Enter the year to find whether it is leap year or not = ");
       int year= Sc.nextInt();
       if (((year %4 ==0) && (year%100 !=0)) || (year%400==0))
            System.out.println(+year+" is a leap year");
       else
            System.out.println(+year+" is not a leap year");
       
    }
    
}

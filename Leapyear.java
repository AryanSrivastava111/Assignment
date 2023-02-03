package ARYANJAVA;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int year=0;
       Scanner sc=new Scanner(System.in);
       System.out.print("enter the year");
       year=sc.nextInt();
       if(year%4==0) {
    	   System.out.println("this is leap year");
       }
       else {
    	   System.out.print("this is not leap year");
       }
	}

}

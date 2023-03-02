package mypackage;

import java.util.Scanner;

public class Odd {
	//method for the even
	static boolean even(int n) {
		for(int i=n;i>0;i=n/10) {
			
		
		if(i%2!=0) {
        	return true;
        }
		else {
			return false;
		}
	}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.print(even(n));
	}

}

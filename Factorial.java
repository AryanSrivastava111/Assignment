package Newpackage;
import java.util.*;
public class Factorial {
	 public static int fact(int n) {
		
		 int s;
		 if(n>=1) {
			s=n*fact(n-1);
			return s;
		}
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       //enter the input
       System.out.println("enter the value of the scanner");
       int m=sc.nextInt();
       //called the fact method 
       System.out.println("the fact = "+fact(m));
	}

}

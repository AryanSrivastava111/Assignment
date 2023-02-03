package ARYANJAVA;

import java.util.Scanner;

public class Maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the first number");
      int a=sc.nextInt();
      System.out.println("enter the Second number");
      int b=sc.nextInt();
      if(a>b) {
    	  System.out.println("maximum = "+a +"and minimus is ="+b);
      }
      else {
    	  System.out.println("maximum = "+b +" and minimus is ="+a);
      }
	}

}

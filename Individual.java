package ARYANJAVA;

import java.util.Scanner;

public class Individual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the integer");
      int a=sc.nextInt();
      String b=Integer.toString(a);
      char [] s=b.toCharArray();
      System.out.print("the individual char are :");
      for(int i=0;i<s.length;i++) {
    	 
    	  System.out.print(s[i]+" ");
      }
	}

}

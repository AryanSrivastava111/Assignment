package ARYANJAVA;

import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double minutesInYear = 60 * 24 * 365;

	        Scanner input = new Scanner(System.in);

	        System.out.print("Input the time"
	        		+ "of minutes: ");

	        double min = input.nextDouble();

	        long years = (long) (min / minutesInYear);
	        int days = (int) (min / 60 / 24) % 365;

	        System.out.println((int) min + " minutes in year and day" + years + " years and " + days + " days");
	}

}

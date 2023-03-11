package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Secondsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// take the size of the n
		System.out.println("enter the size of the array");
		int n = sc.nextInt();

		int[] a = new int[n];
		// take the input from the user
		System.out.println("enter the element of the array");
		for (int i = 0; i <= n - 1; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		System.out.print("second smallest number = " + a[1]);
	}

}

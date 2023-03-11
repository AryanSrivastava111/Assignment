package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Maximinarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int a[]= {2,10,6,8,4};
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

		System.out.print("maximum = " + a[a.length - 1] + " " + "minimum = " + a[0]);

	}

}

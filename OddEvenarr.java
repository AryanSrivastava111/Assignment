package Assignment;

import java.util.Scanner;

public class OddEvenarr {

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
		for (int i = 0; i <= n - 1; i++) {
			if (a[i] % 2 == 0) {
				System.out.print("even :: " + a[i] + "  ");
			} else {
				System.out.print("odd  :: " + a[i] + "  ");
			}
		}
	}

}

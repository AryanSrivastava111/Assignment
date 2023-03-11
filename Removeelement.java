package Assignment;

import java.util.Scanner;

public class Removeelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// take the size of the n
		System.out.println("enter the size of the array");
		int n = sc.nextInt();

		int[] a = new int[n];
		int i;
		int j;
		// take the input from the user
		for (j = 0; j <= n - 1; j++) {
			a[j] = sc.nextInt();
		}
		System.out.println("give the number for the remove from array");
		int m = sc.nextInt();
		for (j = 0; j <= n - 1; j++) {
			if (m == a[j]) {
				continue;
			}
			System.out.print(a[j] + " ");

		}
	}
}

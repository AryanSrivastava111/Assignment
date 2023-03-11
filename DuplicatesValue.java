package Assignment;

import java.util.Scanner;

public class DuplicatesValue {

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
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j]) {
					System.out.print("the duplicate value is  = " + a[j]);
				}
			}
		}
	}

}

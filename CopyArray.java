package Assignment;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n = sc.nextInt();
		int[] b = new int[n];
		int[] a = new int[n];

		int j = 0;
		int i = 0;
		// take the input from the user
		for (j = 0; j <= n - 1; j++) {
			a[j] = sc.nextInt();
		}
		System.out.println("copy the array element in new array");
		for (j = 0; j <= n - 1; j++) {
			while (i <= n - 1 && j <= n - 1) {
				b[i] = a[j];
				System.out.print(b[i] + " ");
				i++;
				j++;
			}

		}
	}

}

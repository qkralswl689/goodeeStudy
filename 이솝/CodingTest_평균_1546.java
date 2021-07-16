package code;

import java.util.Scanner;

public class Code {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		int N = sc.nextInt();
//		double arr[] = new double[N];
		double arr[] = new double[sc.nextInt()];

		double max = arr[0];
		double sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] > max) {
				max = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i] / max * 100;
		}

		System.out.println(sum / arr.length);

	}
}

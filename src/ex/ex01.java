package ex;

import java.util.Scanner;
import java.util.Arrays;

/*
 * Date: 2016/12/12
 * Author: 105021026 ¸â¨Ø°p
 */
public class ex01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("How many data?");
		int n = scn.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Total,Members,Kind:");
			System.out.println("Enter all kind prize:");
			int sum = 0;
			int T = scn.nextInt();
			int m = scn.nextInt();
			int k = scn.nextInt();
			int a[] = new int[k];
			if (m <= k && k <= 100) {
				for (int j = 0; j < k; j++) {
					a[j] = scn.nextInt();
				}
				Arrays.sort(a);
				for (int p = 0; p < m; p++) {
					sum += a[p];
				}
				if(sum<T){
					System.out.println(sum);
				}
				else{
					System.out.println("Impossible");
				}

			}
		}
	}
}
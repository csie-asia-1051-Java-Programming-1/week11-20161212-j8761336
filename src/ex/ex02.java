package ex;

import java.util.Scanner;

/*
 * Date: 2016/12/12
 * Author: 105021***  ???
 */
public class ex02 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		String[] a =scn.nextLine().split(" ");
		System.out.println("Size="+(a.length));
		double sum =0;
		for(int i=0;i<a.length;i++){
			sum +=Integer.parseInt(a[i]);
		}
		System.out.printf("Average="+"%.3f\n",sum/a.length);
	}
}
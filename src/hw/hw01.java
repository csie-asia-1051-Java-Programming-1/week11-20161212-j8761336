package hw;
import java.util.Scanner;
/*
 * Date: 2016/12/12
 * Author: 105021026 ¸â¨Ø°p
 */
public class hw01 {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		String a =scn.nextLine();
		int z=scn.nextInt();
		char b[]=new char[a.length()];
		for(int i=0;i<a.length();i++){
			b[i]=a.charAt(i);
		}
		for(int i=0;i<a.length();i++){
			if(b[i]>=65 && b[i]<=90){
				b[i]+=z;
				if(b[i]+z>90){
					b[i]-=26;
				}
			}
			else if(b[i]>=97 && b[i]<=122){
				b[i]+=z;
				if(b[i]+z>122){
					b[i]-=26;
				}
			}
			else{
				b[i]=b[i];
			}
		}
		for(int i=0;i<a.length();i++){
			System.out.print(b[i]);
		}
	}
}
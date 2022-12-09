package Java;

import java.util.Scanner;

public class Que2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number of  fibonacci sequence you want:");
		
		int n = sc.nextInt();
		int num1 = 0,num2= 1;
		System.out.print(num1+" "+num2);
		for(int i = 2;i<n;i++) {
			int num3 = num1+num2;
			System.out.print(" "+ num3);
			num1 = num2;
			num2 = num3;
		}
		
	}
}


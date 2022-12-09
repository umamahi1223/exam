package Java;

import java.util.Scanner;

public class Que1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.next();
		int count=0;
		String vowel= "";
		for(int i=0;i<s.length();i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' ||
					s.charAt(i) == 'o' ||  s.charAt(i) == 'u') {
				vowel += s.charAt(i);
				count++;
			}
		
}
		if(count>0) {
			System.out.println("enter string "+s+" contains vowel");
			
		}
		else {
			System.out.println("enter string "+s+" doesnot contains vowel");
		}
		sc.close();
	}
}
	



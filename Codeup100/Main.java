package CodeUp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// ----------------1032-------------- (10진수->8진수)
		/*
		 * int ten; ten = sc.nextInt(); System.out.printf("%o",ten);
		 */
//		int ten;
//		ten = sc.nextInt();
//		System.out.printf("%x",ten); //16진수(소문자)
//		System.out.printf("%X",ten); //16진수(대문자)
		
		
		
		// 8진수 -> 10진수 
		
		int eight ;
		
		eight = sc.nextInt();
		String ee = String.format("%o", eight);
		
		System.out.println(ee);
		int tens = Integer.parseInt(ee);
		System.out.println(tens);
		System.out.printf("%d",tens);
	}

}

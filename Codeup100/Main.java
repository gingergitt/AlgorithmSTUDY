package CodeUp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// ----------------1032-------------- (10����->8����)
		/*
		 * int ten; ten = sc.nextInt(); System.out.printf("%o",ten);
		 */
//		int ten;
//		ten = sc.nextInt();
//		System.out.printf("%x",ten); //16����(�ҹ���)
//		System.out.printf("%X",ten); //16����(�빮��)
		
		
		
		// 8���� -> 10���� 
		
		int eight ;
		
		eight = sc.nextInt();
		String ee = String.format("%o", eight);
		
		System.out.println(ee);
		int tens = Integer.parseInt(ee);
		System.out.println(tens);
		System.out.printf("%d",tens);
	}

}

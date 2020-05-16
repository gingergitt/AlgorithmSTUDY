package CodeUp;

import java.util.Scanner;

public class codeup11 {

	public static void main(String[] args) {

		String[] num;
		String numbers;
		Scanner sc = new Scanner(System.in);

		// 5자리의 정수 입력받기
		numbers = sc.next();

		num = numbers.split("");

		for (int i = 0; i < num.length; i++) {

			int num2 = Integer.parseInt(num[i]);

//			System.out.printf("[%d]\n",Integer.parseInt(num[i])*10000);
			if (i == 0) {
				System.out.printf("[%d]\n", num2 * 10000);
			} else if (i == 1) {
				System.out.printf("[%d]\n", num2 * 1000);
			} else if (i == 2) {
				System.out.printf("[%d]\n", num2 * 100);
			} else if (i == 3) {
				System.out.printf("[%d]\n", num2 * 10);
			} else if (i == 4) {
				System.out.printf("[%d]\n", num2 * 1);

			}

		}

	}

}

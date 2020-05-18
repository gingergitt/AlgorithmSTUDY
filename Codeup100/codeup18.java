package CodeUp;

import java.util.Scanner;

public class codeup18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//1041 
		String alpa;
		alpa = sc.next();
		//아스키 10진수로 바꾸기 
		int beta = (int) alpa.charAt(0)+1;
		//다시 아스키코드로 변환 (+1 한 값)
		char gamma = (char) beta;
		System.out.println(gamma);
		
		
		
	}

}

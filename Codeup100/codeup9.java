package CodeUp;

import java.util.Scanner;

//1022 : [기초-입출력] 문장 1개 입력받아 그대로 출력하기(설명)
public class codeup9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String sentence = sc.nextLine();
		System.out.printf("%s",sentence);
		
		
		//1023 : [기초-입출력] 실수 1개 입력받아 부분별로 출력하기(설명)
		String a;
		a = sc.nextLine();
		// . 을 기준으로 나눌 때, 무조건 \\ 넣어줘야 인식함 !!
		String[] b = a.split("\\.");
		String c;
		c = b[0];
		String d = b[1];
		
		System.out.println(c);
		System.out.println(d);
	}

}

package CodeUp;

import java.util.Scanner;
//1020 : [기초-입출력] 주민번호 입력받아 형태 바꿔 출력하기
public class codeup7 {

	public static void main(String[] args) {

		String front, back;
		String code;
		Scanner sc = new Scanner(System.in);

		code= sc.next();
		front = code.substring(0,code.lastIndexOf("-"));
		back = code.substring(code.indexOf("-")+1,code.length());
		
		if(code.length()>12) {
			System.out.println(front+back);
		}
		
	}	

}

package CodeUp;

import java.util.Scanner;

//1014 : [기초-입출력] 문자 2개 입력받아 순서 바꿔 출력하기(설명)
//1015 : [기초-입출력] 실수 입력받아 둘째 자리까지 출력하기(설명)
public class codeup4 {
	public static void main(String[] args) {
		//2개의 문자(ASCII CODE)를 입력받아서 순서를 바꿔 출력해보자.
		String x, y;
		Scanner sc = new Scanner(System.in);
		x = sc.next();
		y = sc.next();
		
		System.out.printf("%s %s",y,x);
		
		
		/*실수(float) 1개를 입력받아 저장한 후,저장되어 있는 값을 소수점 셋 째 자리에서 반올림하여
		소수점 이하 둘 째 자리까지 출력하시오.*/
		
		float num;
		Scanner sc1 = new Scanner(System.in);
		num = sc1.nextFloat();
		System.out.printf("%.2f",num);

	}
}

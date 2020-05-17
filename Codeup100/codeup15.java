package CodeUp;
//*********** 진수변환
import java.util.Scanner;
/* 중요 ! 
 10진수->2진수 변환 : Integer.toBinaryString(int);
 10진수->8진수 변환 : Integer.toOctalString(int);
 10진수->16진수 변환 : Integer.toHexString(int);
 
 2진수-> 10진수 변환 : Integer.valueOf(string,2);
 8진수-> 10진수 변환 : Integer.valueOf(string,8);
 16진수-> 10진수 변환 : Integer.valueOf(string,16);
 */
public class codeup15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// ----------------1032-------------- (10진수->8진수)
		/*
		 * int ten; 
		 * ten = sc.nextInt(); 
		 * System.out.printf("%o",ten);
		 */
		int ten;
		ten = sc.nextInt();
		System.out.printf("%x",ten); //16진수(소문자)
		System.out.printf("%X",ten); //16진수(대문자)
		
		
		
		// 8진수 -> 10진수  ************* (1035)
		
		String start ;
		int eight;
		start=sc.next();
		eight = Integer.valueOf(start, 8); //8진수로 바꾸기
		System.out.println(eight);
		
		//16진수 -> 8진수 (Integer.valueOf(string,8); (1036)
		
		String Hexx;
		Hexx = sc.next();
		int RealHex = Integer.valueOf(Hexx, 16);
		System.out.printf("%o",RealHex);
		
		sc.close();

	}

}

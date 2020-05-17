package CodeUp;
import java.util.Scanner;
//**** 아스키코드 변환하기 
public class codeup16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 1036
		
		char word; //영문자입력위함
		word = sc.nextLine().charAt(0); //charAt() : 문자열추출하기
		int ten = (int) word; //간단히 형변환만해줘서 가져오기 
		System.out.printf("%d",ten);
		// 1037 
		
		int ddd; 
		ddd = sc.nextInt();
		char asciii = (char) ddd;
		System.out.printf("%c",asciii);
		
		

	}

}

package CodeUp;
//*********** ������ȯ
import java.util.Scanner;
/* �߿� ! 
 10����->2���� ��ȯ : Integer.toBinaryString(int);
 10����->8���� ��ȯ : Integer.toOctalString(int);
 10����->16���� ��ȯ : Integer.toHexString(int);
 
 2����-> 10���� ��ȯ : Integer.valueOf(string,2);
 8����-> 10���� ��ȯ : Integer.valueOf(string,8);
 16����-> 10���� ��ȯ : Integer.valueOf(string,16);
 */
public class codeup15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// ----------------1032-------------- (10����->8����)
		/*
		 * int ten; 
		 * ten = sc.nextInt(); 
		 * System.out.printf("%o",ten);
		 */
		int ten;
		ten = sc.nextInt();
		System.out.printf("%x",ten); //16����(�ҹ���)
		System.out.printf("%X",ten); //16����(�빮��)
		
		
		
		// 8���� -> 10����  ************* (1035)
		
		String start ;
		int eight;
		start=sc.next();
		eight = Integer.valueOf(start, 8); //8������ �ٲٱ�
		System.out.println(eight);
		
		//16���� -> 8���� (Integer.valueOf(string,8); (1036)
		
		String Hexx;
		Hexx = sc.next();
		int RealHex = Integer.valueOf(Hexx, 16);
		System.out.printf("%o",RealHex);
		
		sc.close();

	}

}

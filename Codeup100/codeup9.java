package CodeUp;

import java.util.Scanner;

//1022 : [����-�����] ���� 1�� �Է¹޾� �״�� ����ϱ�(����)
public class codeup9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String sentence = sc.nextLine();
		System.out.printf("%s",sentence);
		
		
		//1023 : [����-�����] �Ǽ� 1�� �Է¹޾� �κк��� ����ϱ�(����)
		String a;
		a = sc.nextLine();
		// . �� �������� ���� ��, ������ \\ �־���� �ν��� !!
		String[] b = a.split("\\.");
		String c;
		c = b[0];
		String d = b[1];
		
		System.out.println(c);
		System.out.println(d);
	}

}

package CodeUp;

import java.util.Scanner;

public class codeup3 {

	public static void main(String[] args) {
		//
		String a;
		
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextLine();
		System.out.println(a);
		
//		//
		float x;
		Scanner sc = new Scanner(System.in);
		x = sc.nextFloat();
		//double, float���� %f�����ΰ� ����ϱ� 
		System.out.printf("%f",x);
		
		
		//Scanner��ü�� 2���̻� �������� nosuchelementerror�߻�
		//Scanner���ÿ��� �ϳ��� �����ͼ� �����ϴ� ������� �ؾ��Ѵ�. 
		int b,c;
		Scanner sc2 = new Scanner(System.in);
		b= sc2.nextInt();
		c=sc2.nextInt();
	
		System.out.printf("%d %d",b,c);
	
	}
	

}

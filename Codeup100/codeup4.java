package CodeUp;

import java.util.Scanner;

//1014 : [����-�����] ���� 2�� �Է¹޾� ���� �ٲ� ����ϱ�(����)
//1015 : [����-�����] �Ǽ� �Է¹޾� ��° �ڸ����� ����ϱ�(����)
public class codeup4 {
	public static void main(String[] args) {
		//2���� ����(ASCII CODE)�� �Է¹޾Ƽ� ������ �ٲ� ����غ���.
		String x, y;
		Scanner sc = new Scanner(System.in);
		x = sc.next();
		y = sc.next();
		
		System.out.printf("%s %s",y,x);
		
		
		/*�Ǽ�(float) 1���� �Է¹޾� ������ ��,����Ǿ� �ִ� ���� �Ҽ��� �� ° �ڸ����� �ݿø��Ͽ�
		�Ҽ��� ���� �� ° �ڸ����� ����Ͻÿ�.*/
		
		float num;
		Scanner sc1 = new Scanner(System.in);
		num = sc1.nextFloat();
		System.out.printf("%.2f",num);

	}
}

package CodeUp;
import java.util.Scanner;
//**** �ƽ�Ű�ڵ� ��ȯ�ϱ� 
public class codeup16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 1036
		
		char word; //�������Է�����
		word = sc.nextLine().charAt(0); //charAt() : ���ڿ������ϱ�
		int ten = (int) word; //������ ����ȯ�����༭ �������� 
		System.out.printf("%d",ten);
		// 1037 
		
		int ddd; 
		ddd = sc.nextInt();
		char asciii = (char) ddd;
		System.out.printf("%c",asciii);
		
		

	}

}

package CodeUp;

import java.util.Scanner;
import java.util.StringTokenizer;
// *********************�ٽ��ϱ�
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String date = sc.nextLine();
		
		//"."�� �߶��ֱ�
		StringTokenizer token = new StringTokenizer(date,".");
		
		//�迭�� �����ϱ�
		int [] arr = new int[3];
		
		int i =0;
		while(token.hasMoreTokens()) {
			//�Է¹��ڿ��� int�迭�� �ֱ� ���� int�� ����ȯ���ش�.
			arr[i] = Integer.parseInt(token.nextToken());
			i+=1;
		}
		String year = String.format("%04d", arr[0]);
		String month = String.format("%02d", arr[1]);
		String day = String.format("%02d", arr[2]);
	
		System.out.println(year+"."+month+"."+day);
		
		
		//split�̳� scanner����ؼ� �ٽ� �غ���.
	}	

}

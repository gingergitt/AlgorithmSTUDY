package CodeUp;

import java.util.Scanner;
import java.util.StringTokenizer;

// *********************�ٽ��ϱ�
public class codeup6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String date = sc.nextLine();

		// "."�� �߶��ֱ�
		StringTokenizer token = new StringTokenizer(date, ".");

		// �迭�� �����ϱ�
		int[] arr = new int[3];

		int i = 0;
		// int countTokens = token.countTokens(); -> intŸ���� countTokens�� ��ū��Ȯ��
		// for(int i=0; i<countTokens; i++ ) {
//		String tk = token.nextToken();

//	}

		// hasMoreToken�� booleanŸ������ ��ū�̳����ִ��� Ȯ�� �� �о��
		while (token.hasMoreTokens()) {
			// �Է¹��ڿ��� int�迭�� �ֱ� ���� int�� ����ȯ���ش�.
			arr[i] = Integer.parseInt(token.nextToken());
			i += 1;
		}

		String year = String.format("%04d", arr[0]);
		String month = String.format("%02d", arr[1]);
		String day = String.format("%02d", arr[2]);

		System.out.println(year + "." + month + "." + day);

	}
	// StringTokenizer����Ͽ� ���ڿ��� ��ū���� ���� �� �ִ�.

//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		String date = scan.nextLine();
//		scan.close();
//		StringTokenizer stn = new StringTokenizer(date, ".");
//		
//		String[] ans = new String[3];
//		String  tk ;
//		for(int i =0; i<3; i++) {
//			tk = stn.nextToken();
//			ans[i] = tk;
//		}
//		int ymd1 = Integer.parseInt(ans[0]);
//		int ymd2 = Integer.parseInt(ans[1]);
//		int ymd3 = Integer.parseInt(ans[2]);
//		
//		
//		System.out.printf("%04d.%02d.%02d",ymd1,ymd2,ymd3);
//	}
}

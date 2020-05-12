package CodeUp;

import java.util.Scanner;
import java.util.StringTokenizer;

// *********************다시하기
public class codeup6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String date = sc.nextLine();

		// "."로 잘라주기
		StringTokenizer token = new StringTokenizer(date, ".");

		// 배열로 보관하기
		int[] arr = new int[3];

		int i = 0;
		// int countTokens = token.countTokens(); -> int타입의 countTokens로 토큰수확인
		// for(int i=0; i<countTokens; i++ ) {
//		String tk = token.nextToken();

//	}

		// hasMoreToken은 boolean타입으로 토큰이남아있는지 확인 후 읽어옴
		while (token.hasMoreTokens()) {
			// 입력문자열을 int배열에 넣기 위해 int로 형변환해준다.
			arr[i] = Integer.parseInt(token.nextToken());
			i += 1;
		}

		String year = String.format("%04d", arr[0]);
		String month = String.format("%02d", arr[1]);
		String day = String.format("%02d", arr[2]);

		System.out.println(year + "." + month + "." + day);

	}
	// StringTokenizer사용하여 문자열을 토큰으로 나눌 수 있다.

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

package CodeUp;

import java.util.Scanner;
import java.util.StringTokenizer;
// *********************다시하기
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String date = sc.nextLine();
		
		//"."로 잘라주기
		StringTokenizer token = new StringTokenizer(date,".");
		
		//배열로 보관하기
		int [] arr = new int[3];
		
		int i =0;
		while(token.hasMoreTokens()) {
			//입력문자열을 int배열에 넣기 위해 int로 형변환해준다.
			arr[i] = Integer.parseInt(token.nextToken());
			i+=1;
		}
		String year = String.format("%04d", arr[0]);
		String month = String.format("%02d", arr[1]);
		String day = String.format("%02d", arr[2]);
	
		System.out.println(year+"."+month+"."+day);
		
		
		//split이나 scanner사용해서 다시 해보기.
	}	

}

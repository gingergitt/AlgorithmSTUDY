package CodeUp;

import java.util.Scanner;

public class codeup12 {

	public static void main(String[] args) {
		//------------------------------------------------------- 1026
		String[] ws ;
		String time;
		Scanner sc = new Scanner(System.in);
	
		time = sc.next();
		ws = time.split(":");
		
		//00일때에 대한 처리가 필요함 -> equals로 처리
		if(ws[1].equals("00")){
			System.out.println("0");
		}else {
			System.out.printf("%2s",ws[1]);
		}
		//--------------------------------------------------------- 1027
		String[] now;
		String date;
		Scanner sc2 = new Scanner(System.in);
		
		date = sc2.next();
		
		now = date.split("\\.");
		//** String.format 구조 잘 알아놓기 --> java에서 String의 형식을 지정하고싶을때
		// ex) 97 -> 0097 등으로 0을 추가하고 싶을때, 포맷을 지정한다. (주의: "%d",다음에는 int들어와야함)
		String year = String.format("%04d",Integer.parseInt(now[0]));
		String month = String.format("%02d",Integer.parseInt(now[1]));
		String day = String.format("%02d",Integer.parseInt(now[2]));

		System.out.println(day+"-"+month+"-"+year);
		
		 
		

	}
}

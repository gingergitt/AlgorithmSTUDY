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
		
		//00�϶��� ���� ó���� �ʿ��� -> equals�� ó��
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
		//** String.format ���� �� �˾Ƴ��� --> java���� String�� ������ �����ϰ������
		// ex) 97 -> 0097 ������ 0�� �߰��ϰ� ������, ������ �����Ѵ�. (����: "%d",�������� int���;���)
		String year = String.format("%04d",Integer.parseInt(now[0]));
		String month = String.format("%02d",Integer.parseInt(now[1]));
		String day = String.format("%02d",Integer.parseInt(now[2]));

		System.out.println(day+"-"+month+"-"+year);
		
		 
		

	}
}

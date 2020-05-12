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
		//double, float형은 %f형태인것 기억하기 
		System.out.printf("%f",x);
		
		
		//Scanner객체를 2개이상 가져오면 nosuchelementerror발생
		//Scanner사용시에는 하나를 가져와서 공유하는 방식으로 해야한다. 
		int b,c;
		Scanner sc2 = new Scanner(System.in);
		b= sc2.nextInt();
		c=sc2.nextInt();
	
		System.out.printf("%d %d",b,c);
	
	}
	

}

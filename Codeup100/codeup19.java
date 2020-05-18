package CodeUp;

import java.util.Scanner;

public class codeup19 {
//****** 1045 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a,b;
		a= sc.nextInt();
		b= sc.nextInt();
		System.out.printf("%d\n",a+b);
		System.out.printf("%d\n",a-b);
		System.out.printf("%d\n",a*b);
		System.out.printf("%d\n",a/b);
		System.out.printf("%d\n",a%b);
		
		float c = (float) a / (float) b;
		System.out.printf("%.2f\n",c);
		
		//소수점 둘째자리에서 반올림하기 
//		System.out.println(Math.round(a/b));
		
		
		
		
	}

}

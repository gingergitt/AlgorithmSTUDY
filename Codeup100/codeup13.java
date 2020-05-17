package CodeUp;

import java.util.Scanner;

// ***
public class codeup13 {

	public static void main(String[] args) {
		

		long num;
		Scanner sc1 = new Scanner(System.in);

		num = sc1.nextLong();

		System.out.println(num);

		/*
		 * ** 자체 메소드 만들어서 풀기 (long형으로 해결하는게 훨씬 쉬움) String n; Scanner sc = new
		 * Scanner(System.in); n = sc.next(); int a = Integer.parseUnsignedInt(n); long
		 * c = unsigned32(a); System.out.println(c);
		 * 
		 * 
		 * 자바에 없는 unsigned int 처리를 위해 자체적으로 처리하여 실행 signed int로 넘어온 값을 long형으로 캐스팅하여
		 * 사용하는 방법. public static long unsigned32(int n) { return n & 0xFFFFFFFFL; }
		 */


	}
}
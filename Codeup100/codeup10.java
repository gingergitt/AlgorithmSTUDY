package CodeUp;

//***
import java.util.Scanner;

public class codeup10 {

	public static void main(String[] args) {

		String ww;
		String [] words; //배열생성
		Scanner sc = new Scanner(System.in);
		
		ww= sc.next();
		words = ww.split(""); //한글자씩 나눠서 	배열에 저장.
		
		for(int i=0;i<words.length;i++) {
			System.out.printf("'%s'\n",words[i]);
		}
		
		
	}

}

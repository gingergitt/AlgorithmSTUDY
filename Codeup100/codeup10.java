package CodeUp;

//***
import java.util.Scanner;

public class codeup10 {

	public static void main(String[] args) {

		String ww;
		String [] words; //�迭����
		Scanner sc = new Scanner(System.in);
		
		ww= sc.next();
		words = ww.split(""); //�ѱ��ھ� ������ 	�迭�� ����.
		
		for(int i=0;i<words.length;i++) {
			System.out.printf("'%s'\n",words[i]);
		}
		
		
	}

}

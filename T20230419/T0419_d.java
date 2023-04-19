package T20230419;

import java.util.Scanner;

public class T0419_d {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수: ");
		int x = stdIn.nextInt();
		
		System.out.printf(" 8진수는 %o입니다.\n", x);
		System.out.printf("16진수는 %x입니다.\n", x);
		

	}

}
//완료 printf, %o > 8진수로 출력, %x > 16진수로 출력
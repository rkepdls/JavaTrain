package T20230413;

import java.util.Scanner;

public class T0413_3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a:"); int a = stdIn.nextInt();
		System.out.print("정수 b:"); int b = stdIn.nextInt();
		
		int diff = a >= b ? a - b : b - a;
		
		if (diff <=10)
			System.out.println("두 값의 차이는 10이하입니다.");
		else
			System.out.println("두 값의 차이는 11이상입니다.");

	}

}
//완료
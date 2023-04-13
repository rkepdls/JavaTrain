package T20230413;

import java.util.Scanner;

public class T0413_7 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a:"); int a = stdIn.nextInt();
		System.out.print("정수 b:"); int b = stdIn.nextInt();
		
		if (a < b) {
			int t = a;
			a = b;
			b = t;
		}
		System.out.println("a<=b가 되도록 정렬했습니다.");
		System.out.println("변수 a는 " + a + "입니다.");
		System.out.println("변수 b는 " + b + "입니다.");

	}

}
//완료
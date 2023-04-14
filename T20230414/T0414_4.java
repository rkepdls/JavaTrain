package T20230414;

import java.util.Scanner;

public class T0414_4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수 A : ");  int a = stdIn.nextInt();
		System.out.print("정수 B : ");  int b = stdIn.nextInt();
		
		if (a > b) {             // a가 b보다 크면
			int t = a;           // 두 값을 교환
			a = b;
			b = t;
		}
		
		do {
			System.out.print(a + " ");
			a = a + 1;
		} while (a <= b);
		System.out.println();
		
	}

}
//완료 a > b까지의 정수. a가 크더라도 교환으로 작은 숫자가 될것
package T20230417;

import java.util.Scanner;

public class T0417_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		do {
			System.out.print("양의 정숫값: ");
			n = stdIn.nextInt();
		}	while ( n <= 0);
		
		int factorial = 1;
		int i = 1;
		
		while (i <= n) {
			factorial *= i;       // factorial에 i 곱하기
			i++;                  // i 증가
		}
		System.out.println("1부터 " + n + "까지의 곱은 " + factorial + "입니다.");
	}

}

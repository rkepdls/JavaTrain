package T20230414;

import java.util.Scanner;

public class T0414_9 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("양의 정숫값의 자릿수를 표시합니다.");
		int x;
		do {
			System.out.print("양의 정숫값 : ");
			x = stdIn.nextInt();
		} while (x <= 0);
		
		int digit=0;   // 자릿수
		while (x > 0) {
			digit++;   // 자릿수를 증가
			x /= 10;   // x를 10으로 나눔
		}
		System.out.println("입력한 숫자는 " + digit + "자리입니다.");

	}

}
//완료 x가 0보다 크다면 자리수가 1 증가. 10으로 나눈 뒤에 다시 진행
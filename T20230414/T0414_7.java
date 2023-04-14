package T20230414;

import java.util.Scanner;

public class T0414_7 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇 개의 *를 표시할까요? : ");
		int n = stdIn.nextInt();
		if (n > 0);
		int i = 0;
		while(i < n) {
			System.out.print('*');
			i++;
		}
		System.out.println();

	}

}
//완료 입력 숫자가 0보다 커야하며, i값은 0부터 시작. n보다 작다면 계속 증가
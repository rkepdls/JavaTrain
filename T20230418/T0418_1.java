package T20230418;

import java.util.Scanner;

public class T0418_1 {

	public static void main(String[] args) {
		//정숫값의 제곱 표시
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정숫값: ");
		int n = stdIn.nextInt();
		for (int i=1; i<=n; i++)
			System.out.println(i + "의 제곱은 " + i * i+"입니다.");

	}

}


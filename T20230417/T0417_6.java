package T20230417;

import java.util.Scanner;

public class T0417_6 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1부터 n가지의 합을 구합니다.");
		int n;
		do {
			System.out.print("n의 값: ");
			n = stdIn.nextInt();
		} while (n <= 0);
		int sum = 0;
		for (int i=1; i < n; i++) {
			System.out.print(i + " + ");
			sum += i;                  // sum에 i를 더한다
		}
		System.out.print(n + " = ");
		sum += n;                      // sum에 n을 더한다
		System.out.println(sum);

	}

}

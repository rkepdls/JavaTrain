package T20230414;

import java.util.Scanner;

public class T0414_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x;    // 읽는 값
		do {
			System.out.print("세 자리의 정숫값 : ");
			x = stdIn.nextInt();
		} while (x < 100 || x > 999);  // x는 3자리 양의 정수여야 한다.
		
		
		System.out.print("입력한 값은 " + x + "입니다.");

	}

}
//완료. 세 자리 숫자를 입력해야 결과가 출력됨
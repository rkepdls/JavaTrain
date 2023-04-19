package T20230419;

import java.util.Scanner;

public class T0419_a {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정수를 더합니다.");
		int total = 0;                    // 전체 그룹의 합계
		
		Outer:
			for (int i=1; i<=10; i++) {
				System.out.println(i+"그룹");
				
				for(int j=0; j<5; j++) {
					System.out.print("정수: ");
					int t = stdIn.nextInt();
					if (t == 99999)
						break Outer;
					else if (t == 88888)
						continue Outer;
					total += t;
				}
			}
			System.out.println("\n합계는" + total + "입니다.");
	}

}
//완료 88888은 그룹 입력 종료, 99999는 전체 입력 종료하는걸로 구성
package T20230421;

import java.util.Random;
import java.util.Scanner;

public class T0421_f {

	public static void main(String[] args) {
		ComputerPlayer rand = new ComputerPlayer();
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("요소 수: ");
			n = stdIn.nextInt();            //요소 수 읽기
		} while (n>10);
		int[] a = new int[n];               //배열 생성
		
		for (int i=0; i<n; i++) {
			int j;
			do {
				j=0;
				a[i] = 1+rand.nextInt(10);   // 1~10 난수
				for (; j<i; j++)
					if (a[j]==a[i]) break;
			} while (j<i);
		}

		for (int i=0; i<n; i++)
		System.out.println("a[" + i + "] = "+ a[i]);
	}

}
//완료...지만 내용 잘 모르겠다
package T20230424;

import java.util.Random;
import java.util.Scanner;

import T20230508_2.ComputerPlayer;

public class T0424_b {

	public static void main(String[] args) {
		ComputerPlayer rand = new ComputerPlayer();
		Scanner stdIn = new Scanner(System.in);
		String[] dayKorean = {"일", "월", "화", "수", "목", "금", "토"};
		String[] dayEnglish = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
		
		System.out.println("요일명을 영어 소문자로 입력하시오.");
		
		int retry;              //다시 한번
		int last = -1;          //이전 요일
		
		do {
			int day;            //표시할 요일 : 0~6의 난수
			do {
				day = rand.nextInt(7);
			} while (day == last);
			last = day;
			
			int action;
			do {
				System.out.print(dayKorean[day]+ "요일: ");
				String s = stdIn.next();
				
				if (s.equals(dayEnglish[day])) {  //정답
					System.out.println("정답입니다.");
					break;
				} 
				System.out.println("틀렸습니다.");
				do {
					System.out.print("어떻게 할까요? 1..재입력 / 0..정답 보기: ");
					action = stdIn.nextInt();				
				} while (action !=0 && action != 1);
				if (action == 0)
					System.out.println(dayKorean[day] + "요일은 \"" + dayEnglish[day] + "\" 입니다.");
			} while (action == 1);
			
			System.out.print("다시 한번? 1..Yes/0..No: ");
			retry = stdIn.nextInt();
		} while (retry == 1);

	}

}
package T20230501;

public class PeriodTester {

	public static void main(String[] args) {
		Period teajo = new Period(new Day(1392, 8, 5), new Day(1398, 10, 14));
		Period jeongjong = new Period(new Day(1398, 10, 14), new Day(1400, 11, 28));
		Period teajong = new Period(new Day(1400, 11, 28), new Day(1418, 9, 9));
		Period sejong = new Period(new Day(1418, 9, 9), new Day(1450, 3, 30));
		
		System.out.println("태조 = "+teajo);
		System.out.println("정종 = "+jeongjong);
		System.out.println("태종 = "+teajong);
		System.out.println("세종 = "+sejong);
	}
}

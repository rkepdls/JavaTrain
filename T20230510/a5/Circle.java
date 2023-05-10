package T20230510.a5;

public class Circle {
	public static void main(String[] args) {
		double r = double.parseDouble(args[0]);
		System.out.printf("반지름 %.2f인 원의 둘레는 %.2f이고 넓이는 %.2f입니다.\n", r, 2*Math.PI*r*r);
	}

}

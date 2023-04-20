package T20230420;

public class T0420_d {

	public static void main(String[] args) {
		System.out.println("x           x의 제곱");
		System.out.println("----------------------");
		
		for (int i=0; i<=1000; i++) {
			float x = (float)i/1000;
			System.out.printf("%5.3f   %10.7f\n", x, x*x);
		}

	}

}

//완료 c와 다른 방법
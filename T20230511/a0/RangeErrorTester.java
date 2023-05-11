package T20230511.a0;

import java.util.Scanner;

public class RangeErrorTester {
	static boolean isVaild(int n) {
		return n>=0 && n <=9;
	}
	
	static int add(int a, int b) throws ParameterRangeError, ResultRangeError {
		if (!isVaild(a)) throw new ParameterRangeError(a);
		if (!isVaild(b)) throw new ParameterRangeError(b);
		int result = a + b;
		if (!isVaild(result)) throw new ResultRangeError(result);
		return result;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a: "); int a = stdIn.nextInt();
		System.out.print("정수 b: "); int b = stdIn.nextInt();

		try {
			System.out.println("합은 "+add(a, b)+"입니다.");
		} catch (RangeError e) {
			System.out.println("범위 밖 예외가 발생했습니다.\n"+e.getMessage());
		}
	}

}

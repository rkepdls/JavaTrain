package T20230420;

public class T0420_g {

	public static void main(String[] args) {
		int[] a = new int[5];                     // 배열 선언
		
		for (int i=0; i<a.length; i++)
			a[i] = 5 - i;
		
		for (int i=0; i<a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}

}

//완료 
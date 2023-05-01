package T20230501;

public class Human2Tester {

	public static void main(String[] args) {
		Human2 gildong = new Human2("홍길동", 170, 60);
		Human2 chulsu = new Human2("김철수", 166, 72);
		
		gildong.putData();
		System.out.println("번호: "+gildong.getId());
		
		System.out.println();
		
		chulsu.putData();
		System.out.println("번호: "+chulsu.getId());

	}

}

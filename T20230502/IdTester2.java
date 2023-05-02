package T20230502;

public class IdTester2 {

	public static void main(String[] args) {
		Id a = new Id();
		Id b = new Id();
		
		System.out.println("a의 식별 번호: "+a.getId());
		System.out.println("b의 식별 번호: "+b.getId());
		
		System.out.println("Id.counter = "+Id.getMaxId());
		System.out.println("a.counter = "+a.getMaxId());
		System.out.println("b.counter = "+b.getMaxId());
	}
}

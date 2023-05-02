package T20230502;

class Id {
	private static int counter = 0; //몇번까지 식별 번호를 부여했는가
	private int id;         //식별 번호
	
	//생성자
	public Id() {
		id = ++counter;
	}
	
	//식별 번호 가져오기
	public int getId() { return id; }
	
	//식별 번호 가져오기
	public static int getMaxId() {
		return counter;
	}
}

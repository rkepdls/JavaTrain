package T20230503;

public class Account {
	private static int counter = 0;
	
	private String name;
	private String no;
	private long balance;
	private Day openDay;
	private int id;
	
	//인스턴스 초기화 블록
	{
		id = ++counter;
		System.out.println("은행 계좌를 개설해주셔서 감사합니다.");
	}
	//생성자
	public Account (String name, String no) {
		this(name, no, 0, new Day());
	}
	//생성자
	public Account (String name, String no, long balance, Day openday) {
		this.name = name;
		this.no = no;
		this.balance = balance;
		this.openDay = new Day(openday);
	}
	public String getName() {
		return name;
	}
	public String getNo() {
		return no;
	}
	public long getBalance() {
		return balance;
	}
	public Day getOpenDay() {
		return openDay;
	}public int getId() {
		return id;
	}
	//k원 입금
	void deposit(long k) {
		balance-=k;
	}
	//문자열 표현에 의한 계좌 기본 정보 반환
	public String toString() {
		return "{"+name+", "+no+", "+balance+"}";
	}
}

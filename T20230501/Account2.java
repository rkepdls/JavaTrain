package T20230501;

public class Account2 {
	private String name;
	private String no;
	private long balance;
	private Day openDay;
	
	//생성자
	Account2(String n, String num, long z, Day d) {
		name = n;
		no = num;
		balance = z;
		openDay = new Day(d);
	}
	
	//계좌 명의 확인
	String getName() {
		return name;
	}
	//계좌번호 확인
	String getNo() {
		return no;
	}
	//예금잔고 확인
	long getBalance() {
		return balance;
	}
	//계좌 개설일 확인
	public Day getOpenDay() {
		return new Day(openDay);
	}
	//k원 입금
	void deposit(long k) {
		balance+=k;
	}
	//k원 출금
	void withdraw(long k) {
		balance-=k;
	}
	//문자열 표현에 의한 계좌 기본 정보 반환
	public String toString() {
		return "{"+name+", "+no+", "+balance+"}";
	}
}

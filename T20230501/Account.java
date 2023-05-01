package T20230501;

public class Account {
	private String name;
	private String no;
	private long balance;
	
	//생성자
	Account(String n, String num, long z) {
		name = n;
		no = num;
		balance = z;
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
	//k원 입금
	void deposit(long k) {
		balance+=k;
	}
	//k원 출금
	void withdraw(long k) {
		balance-=k;
	}

}

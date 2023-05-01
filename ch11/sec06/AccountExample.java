package ch11.sec06;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		//예금하기
		account.deposit(10000);
		System.out.println("예금액: "+account.getBalance());
			
			
		//출금하기
		try {
			account.withdraw(30000);
		} catch(InsufficientException e) {
			String message = e.getMessage();      //예외처리 코드와 함께
			System.out.println(message);          //withdraw() 메소드 호출
		}
	}
}

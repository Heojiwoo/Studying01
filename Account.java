
public class Account {

	private String accountNo; // 계좌번호
	private int balance; // 금액
	
	public Account(String accountNo) {
		this.accountNo = accountNo;
	} // 계좌번호를 입력하기 위해 생성자로 만듦
	
	public int deposit(int money) {
		balance = balance + money;
		return balance;
	} // 입금 기능
	
	public int withdraw(int money) {
		balance = balance - money;
		return balance;
	} // 출금 기능
	
	public void showBalance() {
    System.out.println(balance); 
	} // 잔고 확인 기능
}

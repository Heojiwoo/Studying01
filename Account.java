
public class Account {

	private String accountNo; // ���¹�ȣ
	private int balance; // �ݾ�
	
	public Account(String accountNo) {
		this.accountNo = accountNo;
	} // ���¹�ȣ�� �Է��ϱ� ���� �����ڷ� ����
	
	public int deposit(int money) {
		balance = balance + money;
		return balance;
	} // �Ա� ���
	
	public int withdraw(int money) {
		balance = balance - money;
		return balance;
	} // ��� ���
	
	public void showBalance() {
    System.out.println(balance); 
	} // �ܰ� Ȯ�� ���
}

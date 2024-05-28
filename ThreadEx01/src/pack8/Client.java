package pack8;

public class Client implements Runnable {

	private Account account;
	
	public Client(Account account) {
		// TODO Auto-generated constructor stub
		this.account = account;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while (account.getBalance() > 0) {
			// 100, 200, 300
			int money = (int)(Math.random() * 3 + 1) * 100;
			account.withdraw(money);
			
			System.out.println("통장 잔고 : " + account.getBalance());
		}
	}

}

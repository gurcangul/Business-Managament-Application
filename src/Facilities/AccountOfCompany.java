package Facilities;

public class AccountOfCompany {
	
	private double money;
	
	public AccountOfCompany() {
		this.setMoney(10000);
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
	public void spendMoney(double money2) {
		money-=money2;
	}
	
	public void earnMoney(double emoney) {
		money+=emoney;
	}

	@Override
	public String toString() {
		return "AccountOfCompany money=" + money ;
	}
	
	

}

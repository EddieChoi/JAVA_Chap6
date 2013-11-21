
public class CreditLineAccount extends Account{
	int creditLine;
	
	
	CreditLineAccount(String accountNo, String ownerName, 
			int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}


	@Override
	int withdraw(int amount) throws Exception {
		super.withdraw(amount);
		if((this.balance+this.creditLine)<amount){
			throw new Exception("인출이 불가능합니다.");
		}
		balance -= amount;
		
		return amount;
	}
	
}

public class AtmAdapter {
	private Bank bank = new Bank();
	private User user = new User();
	
	public void insertCard() {
		user.getCard();
	}
	
	public boolean validateCard() {
		return bank.validateCard(user.getCard());
	}
	
	public void enterPassword() {
		user.getPsw();
	}
	
	public boolean validatePassword() {
		return bank.validatePassword(user.getPsw());
	}
	
	public void enterValue() {
		user.getValue();
	}
	
	public boolean validateBalance() {
		return bank.validateBalance(user.getValue());
	}
}

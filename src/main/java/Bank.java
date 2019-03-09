public class Bank {
	private String card = "111";
    private String psw = "123";
    private Float balance = 100.00f;
	
    public String getPassword() {
		return psw;
    }
    
    public String getCard() {
    	return card;
    }
    
    public boolean validateCard(String card) {
		if (this.card.equals(card)) {
			return true;
		} else {
			return false; 
		}
    }
 
    public boolean validatePassword(String psw) {
		if (this.psw.equals(psw)) {
			return true;
		} else {
			return false; 
		}
    }

	public boolean validateBalance(Float value) {
		if (0 < value && value <= this.balance) {
			return true;
		} else {
			return false;
		}
	}
}

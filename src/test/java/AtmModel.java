import nz.ac.waikato.modeljunit.Action;
import nz.ac.waikato.modeljunit.FsmModel;

public class AtmModel implements FsmModel{
	
	private AtmAdapter adapter = new AtmAdapter();
	
	private boolean cardOk;
	private boolean pswOk;
	private boolean valueOk;
	
	private enum State {S0, S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, S13}
	
	private State state = State.S0;

	public Object getState() {
		return state;
	}

	public void reset(boolean arg0) {
		state = State.S0;
	}
	
	@Action
	public void insertCard() {
		if (state == State.S0) {
			adapter.insertCard();
			state = State.S1;
		}
	}
	
	@Action
	public void validateCard() {
		if (state == State.S1) {
			cardOk = adapter.validateCard();
			
			if(cardOk == true) {
				state = State.S2;
			}else {
				state = State.S0;
			}		
		}
	}
	
	@Action
	public void requestPassword() {
		if (state == State.S2) {
			state = State.S3;
		}
	}
	
	@Action
	public void enterPassword() {
		if (state == State.S3) {
			adapter.enterPassword();
			state = State.S4;
		}
	}
	
	@Action
	public void validatePassword() {
		if (state == State.S4) {
			pswOk = adapter.validatePassword();
			
			if(pswOk == true) {
				state = State.S5;
			}else {
				state = State.S3;
			}	
		}
	}
	
	@Action
	public void requestValue() {
		if (state == State.S5) {
			state = State.S6;
		}
	}
	
	@Action
	public void enterValue() {
		if (state == State.S6) { 
			adapter.enterValue();
			state = State.S7;
		}
	}
	
	@Action
	public void validateBalance() {
		if (state == State.S7) {
			valueOk = adapter.validateBalance();

			if(valueOk == true) {
				state = State.S8;
			}else {
				state = State.S10; 
			}
		}
	}
	
	@Action
	public void value() {
		if (state == State.S8) { 
			state = State.S9;
		}
	}
	
	@Action
	public void unavailableBalance() {
		if (state == State.S10) { 
			state = State.S11;
		}
	}
	
	@Action
	public void exit() {
		if (state == State.S9 || state == State.S11) {
			state = State.S12;
		}
	}
	
	@Action
	public void cardOut() {
		if (state == State.S12) { 
			//adapter.cardOut();
			state = State.S13;
		}
	}
	
}

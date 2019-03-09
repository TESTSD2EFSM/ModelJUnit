

import static org.junit.Assert.*;

import org.junit.Test;

public class AtmJUnit {

	@Test
	public void TestValidateCard01() {
		Bank bank = new Bank();
		boolean output = bank.validateCard("111");
		assertTrue(output);
	}
	
	@Test
	public void TestValidateCard02() {
		Bank bank = new Bank();
		boolean output = bank.validateCard("222");
		assertFalse(output);
	}
	
	@Test
	public void TestValidatePassword01() {
		Bank bank = new Bank();
		boolean output = bank.validatePassword("123");
		assertTrue(output);
	}
	
	@Test
	public void TestValidatePassword02() {
		Bank bank = new Bank();
		boolean output = bank.validatePassword("246");
		assertFalse(output);
	}
	
	@Test
	public void TestValidateBalance01() {
		Bank bank = new Bank();
		boolean output = bank.validateBalance(50f);
		assertTrue(output);
	}
	
	@Test
	public void TestValidateBalance02() {
		Bank bank = new Bank();
		boolean output = bank.validateBalance(200f);
		assertFalse(output);
	}
}

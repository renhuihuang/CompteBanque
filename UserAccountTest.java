import static org.junit.Assert.*;

import org.junit.Test;

public class UserAccountTest {

	@Test
	public void testDeposit() {
		UserAccount calc = new UserAccount("Alice", 2000);
		if(!calc.deposit(500)){
			fail("Not yet implemented");
		}
		
		if(calc.deposit(-5)){
			fail("Not yet implemented");
		}
		
	}

	@Test
	public void testWithdraw() {
		UserAccount calc = new UserAccount("Alice", 2000);
		if(!calc.withdraw(500)){
			fail("Not yet implemented");
		}
		
		if(calc.withdraw(-5)){
			fail("Not yet implemented");
		}
		
		if(calc.withdraw(3000)){
			fail("Not yet implemented");
		}
	}


}

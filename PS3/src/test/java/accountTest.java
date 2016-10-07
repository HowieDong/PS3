import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class accountTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		Account testAccount = new Account(1122,20000);
		testAccount.setAnnualInterestRate(4.5);
		
		try{
			testAccount.withdraw(2500);
		} catch(InsufficientFundsException e){
			System.out.println("You cannot withdraw.Your balance is below"+e.getAmount());
		}
		
		testAccount.deposit(3000);
		System.out.println("Your balance is:"+ testAccount.getBalance()+
				" The monthly interest is"+testAccount.getMonthlyInterestRate()+
				" The date account created was:"+
				testAccount.getDateCreated());
	}
	

}

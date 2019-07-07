
public class StaticExample {
	public static void main(String[] args) {
		//create account details for John
		Account johnAccount = new Account();
			johnAccount.personName = "John";
			johnAccount.accountNumber = 1020498;
			johnAccount.balance = 700.39;
		//create account details for Mary
		Account maryAccount = new Account ();
			maryAccount.personName = "Mary";
			maryAccount.accountNumber = 1020473;
			maryAccount.balance = 1590.39;
			
		
		//set fee
		Account.fee = 12.40;
		
		//display account fees
		System.out.println("John's fees are: " + johnAccount.fee);
		System.out.println("Mary's fees are: " + maryAccount.fee);
		
		//change account fee
		Account.fee = 6.20;
		
		//display account fees
		System.out.println("John's fees are: " + johnAccount.fee);
		System.out.println("Mary's fees are: " + maryAccount.fee);
		
	}
}

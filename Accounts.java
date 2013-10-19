import java.util.Scanner;

public class Accounts {

	private String name;
	private String pin;
	private double balance;

		
	

	//construction
	public Accounts(String name, String pin, double balance) {
		setName(name);
		setPin(pin);
		setBalance(balance);
	}

	//behavior
	public void checkBalance() {
		System.out.println("Your current balance is " + this.balance);
	}

	public void checkPin() {
		System.out.println("Your pin is " + this.pin);
	}

	public void checkWithdrawal() {
		Scanner reader = new Scanner (System.in);
		System.out.println("Enter how much you want to withdraw: ");
			double yourWithdrawal = reader.nextDouble();
			System.out.println("You have withdrawn " + yourWithdrawal);
			balance=(balance-yourWithdrawal);
			checkBalance();
	}
	public void changeName() {
		Scanner reader = new Scanner (System.in);
		System.out.println("Enter your new name: ");
			String newName = reader.next();
			setName(newName);
			System.out.println("Your new entered name is " + this.name);
	}

	//getters
	public String name() {
		return name;
	}
	public String pin() {
		return pin;
	}

	public double balance() {
		return balance;
	}





	//setters
	public void setName (String name) {
		if (name.length() > 0) {
			this.name=name;
			
		}
		else {
			System.out.println("Invalid name");
		}
	}


	public void setPin(String pin) {
	if (pin.length() ==4) {	
		this.pin=pin;
		}
		else {
			System.out.println("Invalid pin");
		}
		
	}

	public void setBalance (double balance) {
		this.balance = balance;
	}

	//getter
	


	public static void main(String[] args) {


		Accounts account1 = new Accounts("Bob", "7814", 500.00);
		Accounts account2 = new Accounts("Amy", "4024", 1800.00);
		Accounts account3 = new Accounts("Sean", "0000", 1250.00);

		Scanner reader = new Scanner (System.in);

		String str1 = "Enter your pin ";
		System.out.println(str1);
		String yourPin = reader.next();

		Accounts yourAccount = new Accounts("Tom", "9999", 3200.00);
		if (yourPin.equals("7814")) {
			yourAccount = account1;
		} else if (yourPin.equals("4024")) {
			yourAccount=account2;
		} else if (yourPin.equals("0000")) {
			yourAccount=account3;
		}


		String str2 = "Enter 1 to check your balance; 2 to withdraw; 3 to change name; and 4 to change pin: ";
		System.out.println(str2);
		int yourSelection = reader.nextInt();

		if (yourSelection==1) {
			yourAccount.checkBalance();
		} else if (yourSelection==2) {
			yourAccount.checkWithdrawal();
		} else if (yourSelection==3) {
			yourAccount.changeName();
			
		} else if (yourSelection==4) {
			System.out.println("Enter your new pin: ");
			String newPin = reader.next();
			yourAccount.setPin(newPin);
			yourAccount.checkPin();

		}

	} 
}
